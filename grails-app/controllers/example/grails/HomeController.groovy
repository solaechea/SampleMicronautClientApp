package example.grails

import grails.converters.JSON
import org.springframework.beans.factory.annotation.Autowired

class HomeController {

    @Autowired GrailsAppForgeClient appForgeClient

    def profiles() {
        String grailsVersion = '5.1.6'
        render(appForgeClient.profiles(grailsVersion) as JSON)
    }
}

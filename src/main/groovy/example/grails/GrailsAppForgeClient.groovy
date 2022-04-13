package example.grails

import io.micronaut.http.annotation.Get
import io.micronaut.http.client.annotation.Client

@Client("backend")
interface GrailsAppForgeClient {

    @Get("/{version}/profiles")
    List<Map> profiles(String version)
}

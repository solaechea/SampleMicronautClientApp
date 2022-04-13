package org.grails

import org.springframework.beans.factory.support.MergedBeanDefinitionPostProcessor
import org.springframework.beans.factory.support.RootBeanDefinition

class ClassLoaderFixPostProcessor implements MergedBeanDefinitionPostProcessor {
    @Override
    void postProcessMergedBeanDefinition(RootBeanDefinition beanDefinition, Class<?> beanType, String beanName) {
        if (beanName == 'groovyPagesTemplateEngine') {
            // workaround for Grails-gsp with Spring 5.3.18
            beanDefinition.getPropertyValues().removePropertyValue("classLoader")
        }
    }
}
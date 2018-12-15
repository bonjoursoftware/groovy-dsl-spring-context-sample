package com.bonjoursoftware.groovydslspringcontextsample

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ImportResource

@SpringBootApplication
@ImportResource("classpath*:applicationContext.groovy")
class GroovyDslSpringContextSample {

    static void main(String[] args) {
        SpringApplication.run GroovyDslSpringContextSample, args
    }

}

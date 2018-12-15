package com.bonjoursoftware.groovydslspringcontextsample

import com.bonjoursoftware.groovydslspringcontextsample.coffee.Coffee
import groovy.util.logging.Slf4j
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner)
@SpringBootTest
@Slf4j
class GroovyDslSpringContextSampleTests {

    @Autowired
    Coffee sweetCoffee

    @Autowired
    Coffee bitterCoffee

    @Test
    void contextLoads() {
        log.info sweetCoffee.class.simpleName
        log.info bitterCoffee.class.simpleName
    }
}

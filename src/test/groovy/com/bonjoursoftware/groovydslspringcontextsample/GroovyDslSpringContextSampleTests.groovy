package com.bonjoursoftware.groovydslspringcontextsample

import com.bonjoursoftware.groovydslspringcontextsample.coffee.BitterCoffee
import com.bonjoursoftware.groovydslspringcontextsample.coffee.Coffee
import com.bonjoursoftware.groovydslspringcontextsample.coffee.SweetCoffee
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner)
@SpringBootTest
class GroovyDslSpringContextSampleTests {

    @Autowired
    Coffee sweetCoffee

    @Autowired
    Coffee bitterCoffee

    @Test
    void sweetCoffeeInjection() {
        assert sweetCoffee.class == SweetCoffee
    }

    @Test
    void bitterCoffeeInjection() {
        assert bitterCoffee.class == BitterCoffee
    }
}

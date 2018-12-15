# Groovy DSL Spring Context Sample

This sample project demonstrates how to leverage Spring's **GroovyBeanDefinitionReader** to define the Spring application context with Groovy DSL. This is an alternative to the XML and annotations based application context definition.

See the **applicationContext.groovy** resource:
```groovy
beans {
    sugarCube(SugarCube)
    coffeeMachine(CoffeeMachine)
    sweetCoffee([coffeeMachine: 'brew'], sugarCube)
    bitterCoffee([coffeeMachine: 'brew'])
}
``` 
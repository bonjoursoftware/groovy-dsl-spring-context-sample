import com.bonjoursoftware.groovydslspringcontextsample.coffee.CoffeeMachine
import com.bonjoursoftware.groovydslspringcontextsample.coffee.SugarCube

beans {
    sugarCube(SugarCube)
    coffeeMachine(CoffeeMachine)
    sweetCoffee([coffeeMachine: 'brew'], sugarCube)
    bitterCoffee([coffeeMachine: 'brew'])
}

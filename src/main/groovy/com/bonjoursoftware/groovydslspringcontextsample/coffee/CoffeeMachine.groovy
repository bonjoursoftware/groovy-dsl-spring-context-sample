package com.bonjoursoftware.groovydslspringcontextsample.coffee

class CoffeeMachine {

    Coffee brew(SugarCube sugarCube) {
        new SweetCoffee()
    }

    Coffee brew() {
        new BitterCoffee()
    }
}

package factorymethod.staticfactory.drinks.coffee;

import factorymethod.staticfactory.drinks.interfaces.Drink;

//Concrete Drinks are different implementations of the Drink interface.
public class Cappuccino implements Drink {
    public Cappuccino() {
        System.out.println("Cappuccino");
    }
}
package factorymethod.staticfactory.drinks.coffee;

import factorymethod.staticfactory.drinks.interfaces.Drink;

//Concrete Drinks are different implementations of the Drink interface.
public class Espresso implements Drink {
    public Espresso() {
        System.out.println("Espresso");
    }
}
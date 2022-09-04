package factorymethod.staticfactory.drinks.coffee;

import factorymethod.staticfactory.drinks.interfaces.Drink;

//Concrete Drinks are different implementations of the Drink interface.
public class Latte implements Drink {
    public Latte() {
        System.out.println("Latte");
    }
}
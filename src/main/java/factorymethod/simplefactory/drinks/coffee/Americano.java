package factorymethod.simplefactory.drinks.coffee;

import factorymethod.simplefactory.drinks.interfaces.Drink;

//Concrete Drinks are different implementations of the Drink interface.
public class Americano implements Drink {
    public Americano() {
        System.out.println("Americano");
    }
}

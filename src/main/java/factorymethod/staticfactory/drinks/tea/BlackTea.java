package factorymethod.staticfactory.drinks.tea;

import factorymethod.staticfactory.drinks.interfaces.Drink;

//Concrete Drinks are different implementations of the Drink interface.
public class BlackTea implements Drink {
    public BlackTea() {
        System.out.println("Black tea");
    }
}
package factorymethod.staticfactory.drinks.tea;

import factorymethod.staticfactory.drinks.interfaces.Drink;

//Concrete Drinks are different implementations of the Drink interface.
public class GreenTea implements Drink {
    public GreenTea() {
        System.out.println("Green tea");
    }
}
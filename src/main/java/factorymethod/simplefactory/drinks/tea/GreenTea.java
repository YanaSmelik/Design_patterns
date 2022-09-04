package factorymethod.simplefactory.drinks.tea;

import factorymethod.simplefactory.drinks.interfaces.Drink;

//Concrete Drinks are different implementations of the Drink interface.
public class GreenTea implements Drink {
    public GreenTea() {
        System.out.println("Green tea");
    }
}

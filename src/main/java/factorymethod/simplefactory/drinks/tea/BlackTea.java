package factorymethod.simplefactory.drinks.tea;

import factorymethod.simplefactory.drinks.interfaces.Drink;

//Concrete Drinks are different implementations of the Drink interface.
public class BlackTea implements Drink {
    public BlackTea() {
        System.out.println("Black tea");
    }
}

package factorymethod.simplefactory.drinks.tea;

import factorymethod.simplefactory.drinks.interfaces.Drink;

//Concrete Drinks are different implementations of the Drink interface.
public class Tea implements Drink {
    public Tea() {
        System.out.println("Tea");
    }
}

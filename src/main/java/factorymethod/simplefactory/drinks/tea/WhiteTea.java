package factorymethod.simplefactory.drinks.tea;

import factorymethod.simplefactory.drinks.interfaces.Drink;

//Concrete Drinks are different implementations of the Drink interface.
public class WhiteTea implements Drink {
    public WhiteTea() {
        System.out.println("White tea");
    }
}

package factorymethod.staticfactory.drinks.tea;

import factorymethod.staticfactory.drinks.interfaces.Drink;

//Concrete Drinks are different implementations of the Drink interface.
public class WhiteTea implements Drink {
    public WhiteTea() {
        System.out.println("White tea");
    }
}
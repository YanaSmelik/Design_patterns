package factorymethod.simplefactory.drinks.tea;

import factorymethod.simplefactory.drinks.interfaces.Drink;

//Concrete Drinks are different implementations of the Drink interface.
public class OolongTea implements Drink {
    public OolongTea() {
        System.out.println("Oolong tea");
    }
}

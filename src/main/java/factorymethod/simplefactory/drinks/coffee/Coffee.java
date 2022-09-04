package factorymethod.simplefactory.drinks.coffee;

import factorymethod.simplefactory.drinks.interfaces.Drink;

//Concrete Drinks are different implementations of the Drink interface.
public class Coffee implements Drink {

    public Coffee(){
        System.out.println("Coffee");
    }
}

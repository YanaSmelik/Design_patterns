package factorymethod.simplefactory.drinkcreator.abstractions;

import factorymethod.simplefactory.drinks.enums.DrinkTypes;
import factorymethod.simplefactory.drinks.interfaces.Drink;

//The Creator class declares the factory method that returns new product objects.
public abstract class DrinkCreator {
    public abstract Drink pourDrink();

    public abstract Drink pourDrink(DrinkTypes types);

    public String displayMessage() {
        return "Take your ";
    }
}

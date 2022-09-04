package factorymethod.simplefactory.drinkcreator;

import factorymethod.simplefactory.drinkcreator.abstractions.DrinkCreator;
import factorymethod.simplefactory.drinks.coffee.Americano;
import factorymethod.simplefactory.drinks.coffee.Cappuccino;
import factorymethod.simplefactory.drinks.coffee.Coffee;
import factorymethod.simplefactory.drinks.coffee.Espresso;
import factorymethod.simplefactory.drinks.coffee.Latte;
import factorymethod.simplefactory.drinks.enums.CoffeeTypes;
import factorymethod.simplefactory.drinks.enums.DrinkTypes;
import factorymethod.simplefactory.drinks.interfaces.Drink;

//Concrete Creators override the base factory method, so it returns a different type of drink.
public class CoffeeCreator extends DrinkCreator {
    @Override
    public Drink pourDrink() {
        return new Coffee();
    }

    @Override
    public Drink pourDrink(DrinkTypes types) {
        Drink coffee = null;
        switch ((CoffeeTypes) types) {
            case ESPRESSO -> coffee = new Espresso();
            case LATTE -> coffee = new Latte();
            case CAPPUCCINO -> coffee = new Cappuccino();
            case AMERICANO -> coffee = new Americano();
        }
        return coffee;
    }
}

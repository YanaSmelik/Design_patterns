package factorymethod.staticfactory.staticdrinkcreator;

import factorymethod.staticfactory.drinks.coffee.Americano;
import factorymethod.staticfactory.drinks.coffee.Cappuccino;
import factorymethod.staticfactory.drinks.coffee.Espresso;
import factorymethod.staticfactory.drinks.coffee.Latte;
import factorymethod.staticfactory.drinks.enums.CoffeeTypes;
import factorymethod.staticfactory.drinks.enums.DrinkTypes;
import factorymethod.staticfactory.drinks.interfaces.Drink;

//Class with a static factory method to create coffee drinks
public class CoffeeCreator{

    public static Drink pourDrink(DrinkTypes types) {
        Drink coffee = null;
        switch ((CoffeeTypes) types) {
            case ESPRESSO -> coffee = new Espresso();
            case LATTE -> coffee = new Latte();
            case CAPPUCCINO -> coffee = new Cappuccino();
            case AMERICANO -> coffee = new Americano();
        }
        return coffee;
    }

    public static String displayMessage() {
        return "Take your ";
    }
}
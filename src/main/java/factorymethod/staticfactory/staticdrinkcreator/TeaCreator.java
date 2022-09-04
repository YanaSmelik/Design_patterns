package factorymethod.staticfactory.staticdrinkcreator;

import factorymethod.staticfactory.drinks.enums.DrinkTypes;
import factorymethod.staticfactory.drinks.enums.TeaTypes;
import factorymethod.staticfactory.drinks.interfaces.Drink;
import factorymethod.staticfactory.drinks.tea.BlackTea;
import factorymethod.staticfactory.drinks.tea.GreenTea;
import factorymethod.staticfactory.drinks.tea.OolongTea;
import factorymethod.staticfactory.drinks.tea.WhiteTea;

//Class with a static factory method to create tea drinks
public class TeaCreator{

    public static Drink pourDrink(DrinkTypes types) {
        Drink tea = null;
        switch ((TeaTypes) types) {
            case BLACK -> tea = new BlackTea();
            case GREEN -> tea = new GreenTea();
            case OOLONG -> tea = new OolongTea();
            case WHITE -> tea = new WhiteTea();
        }
        return tea;
    }

    public static String displayMessage() {
        return "Take your ";
    }
}
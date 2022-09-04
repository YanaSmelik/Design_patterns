package factorymethod.simplefactory.drinkcreator;

import factorymethod.simplefactory.drinkcreator.abstractions.DrinkCreator;
import factorymethod.simplefactory.drinks.enums.DrinkTypes;
import factorymethod.simplefactory.drinks.enums.TeaTypes;
import factorymethod.simplefactory.drinks.interfaces.Drink;
import factorymethod.simplefactory.drinks.tea.BlackTea;
import factorymethod.simplefactory.drinks.tea.GreenTea;
import factorymethod.simplefactory.drinks.tea.OolongTea;
import factorymethod.simplefactory.drinks.tea.Tea;
import factorymethod.simplefactory.drinks.tea.WhiteTea;

//Concrete Creators override the base factory method, so it returns a different type of drink.
public class TeaCreator extends DrinkCreator {
    @Override
    public Drink pourDrink() {
        return new Tea();
    }

    @Override
    public Drink pourDrink(DrinkTypes types) {
        Drink tea = null;
        switch ((TeaTypes) types) {
            case BLACK -> tea = new BlackTea();
            case GREEN -> tea = new GreenTea();
            case OOLONG -> tea = new OolongTea();
            case WHITE -> tea = new WhiteTea();
        }
        return tea;
    }
}

package factorymethod.staticfactory;

import factorymethod.staticfactory.drinks.enums.CoffeeTypes;
import factorymethod.staticfactory.drinks.enums.TeaTypes;
import factorymethod.staticfactory.staticdrinkcreator.CoffeeCreator;
import factorymethod.staticfactory.staticdrinkcreator.TeaCreator;

public class DrinkMachine {
    public static void main(String[] args) {

        System.out.println("==== Static Factory Method ====");

        System.out.print(TeaCreator.displayMessage());
        TeaCreator.pourDrink(TeaTypes.GREEN);

        System.out.print(CoffeeCreator.displayMessage());
        CoffeeCreator.pourDrink(CoffeeTypes.LATTE);
    }
}
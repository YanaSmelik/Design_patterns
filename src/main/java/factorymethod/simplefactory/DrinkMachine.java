package factorymethod.simplefactory;

import factorymethod.simplefactory.drinkcreator.CoffeeCreator;
import factorymethod.simplefactory.drinkcreator.TeaCreator;
import factorymethod.simplefactory.drinkcreator.abstractions.DrinkCreator;
import factorymethod.simplefactory.drinks.enums.CoffeeTypes;
import factorymethod.simplefactory.drinks.enums.TeaTypes;

public class DrinkMachine {

    public static void main(String[] args) {

        System.out.println("==== Simple Factory Method ====");

        DrinkCreator teaCreator = new TeaCreator();
        System.out.print(teaCreator.displayMessage());
        teaCreator.pourDrink();

        System.out.print(teaCreator.displayMessage());
        teaCreator.pourDrink(TeaTypes.GREEN);

        DrinkCreator coffeeCreator = new CoffeeCreator();
        System.out.print(coffeeCreator.displayMessage());
        coffeeCreator.pourDrink();

        System.out.print(coffeeCreator.displayMessage());
        coffeeCreator.pourDrink(CoffeeTypes.LATTE);
    }
}

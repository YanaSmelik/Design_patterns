package builder;

import builder.builders.Director;
import builder.builders.PizzaBuilder;
import builder.builders.PizzaManualBuilder;
import builder.ingredients.Cheese;
import builder.ingredients.Meat;
import builder.ingredients.Veggies;

//The Client must associate one of the builder objects with the director.
//Usually, it’s done just once, via parameters of the director’s constructor.
//Then the director uses that builder object for all further construction.
//However, there’s an alternative approach for when the client passes the builder object
//to the production method of the director.
//In this case, you can use a different builder each time you produce something with the director.
public class Main {
    public static void main(String[] args) {
        System.out.println("==== BUILDER PATTERN ====");

        PizzaBuilder builder = new PizzaBuilder();
        Director director = new Director();
        director.constructVeganPizza(builder);
        Pizza veganPizza = builder.buildPizza();
        System.out.println("Vegan Pizza: " + veganPizza);

        ManualPizza seafoodPizza;
        PizzaManualBuilder manualBuilder = new PizzaManualBuilder();
        director.constructSeafoodPizza(manualBuilder);
        manualBuilder.addCheese(Cheese.PARMESAN);
        manualBuilder.addVeggies(Veggies.PINEAPPLE);
        manualBuilder.addMeat(Meat.EGG);
        seafoodPizza = manualBuilder.buildManualPizza();
        System.out.println("Seafood Pizza: " + seafoodPizza);

    }
}

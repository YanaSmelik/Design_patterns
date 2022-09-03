package builder.builders;

import builder.ingredients.Cheese;
import builder.ingredients.Dough;
import builder.ingredients.Meat;
import builder.ingredients.Sauce;
import builder.ingredients.Veggies;

//The Director class defines the order in which to call construction steps,
//so you can create and reuse specific configurations of products.
public class Director {

    public void constructVeganPizza(Builder builder) {
        builder.setDough(Dough.THICK);
        builder.setSauce(Sauce.TOMATO);
        builder.setCheese(Cheese.VEGAN);
        builder.setMeat(Meat.VEGAN_SALAMI);
        builder.setVeggies(Veggies.MUSHROOMS, Veggies.TOMATOES, Veggies.OLIVES);
    }

    public void constructSeafoodPizza(Builder builder) {
        builder.setDough(Dough.THIN);
        builder.setSauce(Sauce.PESTO);
        builder.setCheese(Cheese.MOZZARELLA);
        builder.setMeat(Meat.CLAM, Meat.SQUID, Meat.TUNA);
        builder.setVeggies(Veggies.ARTICHOKES, Veggies.GARLIC);
    }
}

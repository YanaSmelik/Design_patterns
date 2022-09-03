package builder.builders;

import builder.Pizza;
import builder.ingredients.Cheese;
import builder.ingredients.Dough;
import builder.ingredients.Meat;
import builder.ingredients.Sauce;
import builder.ingredients.Veggies;

import java.util.Arrays;
import java.util.List;

//Concrete Builder provides different implementations of the construction steps.
// It may produce products that don’t follow the common interface.
public class PizzaBuilder implements Builder {

    private Dough dough;
    private Sauce sauce;
    private List<Cheese> cheese;
    private List<Meat> meat;
    private List<Veggies> veggies;

    @Override
    public void setDough(Dough dough) {
        this.dough = dough;
    }

    @Override
    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    @Override
    public void setCheese(Cheese... cheese) {
        this.cheese = Arrays.asList(cheese);
    }

    @Override
    public void setMeat(Meat... meat) {
        this.meat = Arrays.asList(meat);
    }

    @Override
    public void setVeggies(Veggies... veggies) {
        this.veggies = Arrays.asList(veggies);
    }

    //Product is a resulting object.
    //Products constructed by different builders don’t have to belong to the same class hierarchy or interface.
    public Pizza buildPizza() {
        return new Pizza(dough, sauce, cheese, meat, veggies);
    }
}

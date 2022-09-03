package builder.builders;

import builder.ManualPizza;
import builder.ingredients.Cheese;
import builder.ingredients.Dough;
import builder.ingredients.Meat;
import builder.ingredients.Sauce;
import builder.ingredients.Veggies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Concrete Builder provides different implementations of the construction steps.
// It may produce products that don’t follow the common interface.
public class PizzaManualBuilder implements Builder {
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

    public void addCheese(Cheese... cheeses) {
        List<Cheese> cheeseList = new ArrayList<>();
        cheeseList.addAll(this.cheese);
        cheeseList.addAll(Arrays.asList(cheeses));
        this.cheese = cheeseList;
    }

    public void addMeat(Meat... meats) {
        List<Meat> meatList = new ArrayList<>();
        meatList.addAll(this.meat);
        meatList.addAll(Arrays.asList(meats));
        this.meat = meatList;
    }

    public void addVeggies(Veggies... veggies) {
        List<Veggies> veggieList = new ArrayList<>();
        veggieList.addAll(this.veggies);
        veggieList.addAll(Arrays.asList(veggies));
        this.veggies = veggieList;
    }

    public ManualPizza buildManualPizza() {
        return new ManualPizza(dough, sauce, cheese, meat, veggies);
    }
}

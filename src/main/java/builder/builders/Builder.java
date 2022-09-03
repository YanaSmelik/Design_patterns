package builder.builders;

import builder.ingredients.Cheese;
import builder.ingredients.Dough;
import builder.ingredients.Meat;
import builder.ingredients.Sauce;
import builder.ingredients.Veggies;

//The Builder interface declares product construction steps that are common to all types of builders.
public interface Builder {
    void setDough(Dough dough);
    void setSauce(Sauce sauce);
    void setCheese(Cheese... cheese);
    void setMeat(Meat... meat);
    void setVeggies(Veggies... veggies);
}

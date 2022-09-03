package builder;

import builder.ingredients.Cheese;
import builder.ingredients.Dough;
import builder.ingredients.Meat;
import builder.ingredients.Sauce;
import builder.ingredients.Veggies;

import java.util.List;

public class ManualPizza {
    private final Dough dough;
    private final Sauce sauce;
    private final List<Cheese> cheese;
    private final List<Meat> meat;
    private final List<Veggies> veggies;

    public ManualPizza(Dough dough, Sauce sauce, List<Cheese> cheese, List<Meat> meat, List<Veggies> veggies) {
        this.dough = dough;
        this.sauce = sauce;
        this.cheese = cheese;
        this.meat = meat;
        this.veggies = veggies;
    }

    @Override
    public String toString() {
        return "ManualPizza{" +
                "dough=" + dough +
                ", sauce=" + sauce +
                ", cheese=" + cheese +
                ", meat=" + meat +
                ", veggies=" + veggies +
                '}';
    }
}

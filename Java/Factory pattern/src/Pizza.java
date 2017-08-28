import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mickaël on 28/08/2017.
 */
public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<>();

    void prepare(){
        System.out.println("Preparing " + name +"\nTossing dough...\nAdding sauce\nAdding toppings: ");
        for(String topping: toppings) {
            System.out.println(topping);
        }
    }

    void bake(){
        System.out.println("Bake for 25 minutes at 200°C");
    }

    void cut(){
        System.out.println("Cutting the pizza diagonal slices");
    }

    void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName(){
        return name;
    }
}

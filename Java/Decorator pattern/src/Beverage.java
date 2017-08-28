/**
 * Created by Mickaël on 28/08/2017.
 * De abstracte klasse Beverage is de fundering van al de rest dat gaat volgen. Zowel de dranken als de toppings zullen
 * hiervan extenden.
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription(){
        return description;
    }

    public abstract double cost();


}

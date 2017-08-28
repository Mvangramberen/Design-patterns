/**
 * Created by Mickaël on 28/08/2017.
 */
public class Espresso extends Beverage {


    // In de constructor moeten we basis description zetten. Deze instance is overgeerft van Beverage.
    public Espresso(){
        description = "Espresso";
    }

    // Momenteel moeten we ons nog geen zorgen maken over de toppings. Momenteel is het enkel de basisprijs dat telt.
    @Override
    public double cost() {
        return 1.99;
    }
}

/**
 * Created by Mickaël on 28/08/2017.
 */
public class HouseBlend extends Beverage {

    // In de constructor moeten we basis description zetten. Deze instance is overgeerft van Beverage.
    public HouseBlend(){
        description = "HouseBlend";
    }

    // Momenteel moeten we ons nog geen zorgen maken over de toppings. Momenteel is het enkel de basisprijs dat telt.
    @Override
    public double cost() {
        return 0.89;
    }
}

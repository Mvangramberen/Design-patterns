/**
 * Created by Mickaël on 28/08/2017.
 * Dit is de decorator, daarom extenden we van CondimentsDecorator. Denk eraan dat deze op zijn beurt ook overerft van
 * Beverages!
 */
public class Mocha extends CondimentsDecorator {
    Beverage beverage;

    // Om de instantie van de drank in kwestie te behouden gaan we deze meegeven in de constructor.
    public Mocha (Beverage beverage){
        this.beverage = beverage;
    }

    // Hier gaan we gewoon de description van de topping aan de basis description van de drank toevoegen.
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }


    // Hier wordt de prijs van de topping mee opgetelt aan het totaal. Deze klasse zijn allemaal overgeerft van de Beverages klasse
    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}

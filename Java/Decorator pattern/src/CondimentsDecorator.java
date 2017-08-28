/**
 * Created by Mickaël on 28/08/2017.
 * Om interactie te kunnen hebben met een drank moeten we extenden van Beverage.
 * We moeten ook getDescription mee overnemen, zodat de toppings de description kunnen veranderen.
 */
public abstract class CondimentsDecorator extends Beverage {
    public abstract String getDescription();
}

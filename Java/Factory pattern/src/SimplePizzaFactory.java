/**
 * Created by Mickaël on 28/08/2017.
 * Een factory klasse zorgt ervoor dat je een interface voorziet voor het aanmaken van objecten.
 */
public class SimplePizzaFactory {
    public Pizza createPizza( String type){
        Pizza pizza = null;

        switch(type.trim().toLowerCase()){
            case "ny": pizza = new NYStyleCheesePizza(); break;
            case "chicago" : pizza = new ChicagoStyleCheesePizza(); break;
        }

        return pizza;
    }
}

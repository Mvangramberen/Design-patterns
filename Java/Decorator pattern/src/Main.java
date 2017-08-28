public class Main {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " Prijs : " + beverage.cost());

        // Wat er eigenlijk gebeurt is dat er een drank wordt aangemaakt
        Beverage beverage1 = new Espresso();

        // Er wordt nu een drank terug gegeven ( Whip is eigenlijk een dranken object met dezelfde waarden die hij heeft
        // mee gekregen door beverage 1. Maar heeft zijn eigen waarden er aan bij toegevoegd. En dan wordt beverage1
        // gewoon overschreven met de nieuwe waarden incl. Die van de topping !
        beverage1 = new Whip(beverage1);
        beverage1 = new Mocha(beverage1);

        System.out.println(beverage1.getDescription() + " Prijs : " + beverage1.cost());

        Beverage beverage2 = new HouseBlend();

        // Je mag de decorators dus niet bekijken als de "toppings" maar je moet ze bekijken als "de basisdrank incl. de toppings"
        beverage2 = new Soy(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);

        System.out.println(beverage2.getDescription() + " Prijs : " + beverage2.cost());

    }
}

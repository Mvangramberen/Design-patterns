/**
 * Created by Mickaël on 28/08/2017.
 */
public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza(){
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra thick crust Dough";
        sauce = "Plum tomato sauce";

        toppings.add("Shredded mozarella cheese");
    }

    @Override
    void cut(){
        System.out.println("Cutting the pizza into square slices");
    }
}

public class Main {

    public static void main(String[] args) {
    Store pizzaStore = new Store(new SimplePizzaFactory());


        Pizza pizza = pizzaStore.orderPizza("chicago");
        System.out.println("Jesse heeft \"" + pizza.getName() + "\" besteld");
    }
}

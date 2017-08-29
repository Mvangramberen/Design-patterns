/**
 * Created by Mickaël on 29/08/2017.
 */
public class Tea extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Extracting the tea from the teabag.");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding lemon / orange");
    }
}

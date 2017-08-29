/**
 * Created by Mickaël on 29/08/2017.
 */
public class Coffee extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Grinding / burning coffee beans and extracting coffee");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding: sugar & milk");
    }
}

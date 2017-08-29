/**
 * Created by Mickaël on 29/08/2017.
 */
public class TurkeyAdapter implements Duck {
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey){
        this.turkey = turkey;
    }

    @Override
    public void Quack() {
        turkey.Gobble();
    }

    @Override
    public void fly() {
        turkey.fly();
    }
}

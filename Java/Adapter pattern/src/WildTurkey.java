/**
 * Created by Mickaël on 29/08/2017.
 */
public class WildTurkey implements Turkey {
    @Override
    public void Gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}

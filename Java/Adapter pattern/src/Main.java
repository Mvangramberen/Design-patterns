public class Main {

    public static void main(String[] args) {

        MallardDuck duck = new MallardDuck();

        WildTurkey wildTurkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);

        System.out.println(" The turkey says ...");
        wildTurkey.Gobble();
        wildTurkey.fly();

        System.out.println("The duck says ...");
        testDuck(duck);

        // Dit is de turkey adapter, deze heeft Duck geimplementeerd zodat de functies overeen komen.
        System.out.println("The turkey adapter says ...");
        testDuck(turkeyAdapter);


    }

    static void testDuck(Duck duck){
        duck.Quack();
        duck.fly();
    }
}

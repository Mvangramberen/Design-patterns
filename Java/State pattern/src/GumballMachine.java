/**
 * Created by Mickaël on 29/08/2017.
 *
 */
public class GumballMachine {


    // De mogelijke statussen waarin het gumball machine zich in kan verkeren.
    final static int SOLD_OUT = 0;
    final static int NO_QUATER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3;

    int state = SOLD_OUT;
    int count = 0;


    // Houd bij hoeveel kauwgommen er nog in het machine zitte ...
    public GumballMachine(int count){
        this.count = count;
        if(count > 0){
            state = NO_QUATER;
        }
    }

    public void insertQuarter(){
        switch(state){
            case HAS_QUARTER:
                System.out.println("You can't insert another quarter");
                break;
            case NO_QUATER:
                System.out.println("You inserted a coin");
                state = HAS_QUARTER;
                break;
            case SOLD_OUT:
                System.out.println("You can't insert a quarter, the gumball machine is sold out!");
                break;
            case SOLD:
                System.out.println("Please wait, we're allready giving you a gumball!");

        }
    }

    public void ejectQuarter(){
        switch(state){
            case HAS_QUARTER:
                System.out.println("Coin ejected");
                state = NO_QUATER;
                break;
            case NO_QUATER:
                System.out.println("There is no quarter in the machine");
                break;
            case SOLD:
                System.out.println("You can't get a refund, you are allready having a gumball");
                break;
            case SOLD_OUT:
                System.out.println("You payed, but you aren't getting any gumballs! You got scammed!");
                break;
        }
    }

    public void turnCrank(){
        switch(state){
            case HAS_QUARTER:
                System.out.println("You are getting your gumball in a second!");
                state = SOLD;
                dispense();
                break;
            case NO_QUATER:
                System.out.println("You are not getting free gumballs you greedy bastard! Put some money in!");
                break;
            case SOLD:
                System.out.println("Good try but you're not getting a second gumball");
                break;
            case SOLD_OUT:
                System.out.println("Sorry sold out! ");
                break;
        }
    }

    public void dispense(){
        switch(state){
            case SOLD:
                System.out.println("The gumball is rolling out of the machine");
                count -=1;
                    if(count == 0)
                        {
                            state = SOLD_OUT;
                            System.out.println("Sorry we are sold out");
                        }
                    else
                        {
                            state = NO_QUATER;
                        }
                break;
            case SOLD_OUT:
                System.out.println("No gumballs dispensed");
                break;
            case NO_QUATER:
                System.out.println("You need to pay first");
                break;
            case HAS_QUARTER:
                System.out.println("No gumball dispensed");
                break;
        }
    }

    @Override
    public String toString() {
        return "The current condition of the gumball machine \nState : " + state + "\nAmount of gumballs: " + count ;
    }
}

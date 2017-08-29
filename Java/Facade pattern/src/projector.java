/**
 * Created by Mickaël on 29/08/2017.
 */
public class projector {
    private String input;

    public projector(String input){
        this.input = input;
    }

    public void on(){
        System.out.println("The projector has been turned on");
    }

    public void off(){
        System.out.println("The projector has been turned off");
    }

    public void setInput(String input){
        this.input = input;
    }

    public String getInput(){
        return input;
    }

    public void wideScreenmode(){
        System.out.println("The projector has been setup to use the widescreen mode");
    }

}

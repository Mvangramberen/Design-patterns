/**
 * Created by Mickaël on 29/08/2017.
 */
public class Amplifier {

    private String input;


    public Amplifier(String input){
        this.input = input;
    }


    public void on(){
        System.out.println("The amplifier is turned on");
    }

    public void off(){
        System.out.println("The amplifier is turned off");
    }

    public void setInput(String input){
        this.input = input;
    }

    public void setSurroundSound(){
        System.out.println("The surround sound is ready");
    }

    public void setVolume(int volume){
        System.out.println("The volume has been set to " + volume);
    }


}

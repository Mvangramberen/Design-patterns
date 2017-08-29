/**
 * Created by Mickaël on 29/08/2017.
 */
public class Lights {
    public void on(){
        System.out.println("The theater lights are turned on");
    }

    public void off(){
        System.out.println("The theater lights are turned off");
    }

    public void dim(int percentage){
        System.out.println("The lights are turned to " + percentage + "%");
    }

}

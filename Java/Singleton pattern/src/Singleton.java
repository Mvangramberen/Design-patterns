/**
 * Created by Mickaël on 28/08/2017.
 */
public class Singleton {
    private String message;
    private static Singleton uniqueInstance;

    public Singleton(){}

    public static synchronized Singleton getInstance(){
        if(uniqueInstance == null){
            System.out.println("New instance is created");
            uniqueInstance = new Singleton();
        }
        else
        {
            System.out.println("The instance allready exists");
        }

        return uniqueInstance;
    }

    public void checkMessage(){
        if(message != null ){
            System.out.println(message);
        }
        else
        {
            System.out.println("The instance is empty");
        }
    }


}

/**
 * Created by Micky on 28/08/2017.
 */
public class Animal {
    private flying f;
    private sound s;

    public void setSound(sound s){
        this.s = s;
    }

    public void setFlying(flying f){
        this.f = f;
    }

    public void writeAnimal(){
        System.out.println(f.flying());
        System.out.println(s.sound());

    }
}

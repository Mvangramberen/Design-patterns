public class Main {

    public static void main(String[] args) {

       Animal raarbeest = new Animal();
       raarbeest.setFlying(new jet());
       raarbeest.setSound(new tjirp());

       raarbeest.writeAnimal();

       raarbeest.setFlying(new wings());
       raarbeest.setSound(new bark());

       raarbeest.writeAnimal();
    }
}

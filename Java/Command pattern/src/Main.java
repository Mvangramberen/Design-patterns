/**
 * Het principe van het command pattern is redelijk gemakkelijk, je kan gewoon de functie die aangesproken moet worden,
 * als parameter meegeven.
 *
 * Dit kan je door de interface te gebruiken als instantievariabele.
 *
 *
 */
public class Main {


    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();

        LightOnCommand lightOn = new LightOnCommand(light);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();


    }
}

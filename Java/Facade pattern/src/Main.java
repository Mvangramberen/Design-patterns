import javafx.scene.effect.Light;

public class Main {

    public static void main(String[] args) {

        Amplifier amplifier = new Amplifier("dvd");
        Dvd dvd = new Dvd();
        Lights lights = new Lights();
        Popper popper = new Popper();
        projector projector = new projector("dvd");
        Screen screen = new Screen();


        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(amplifier, dvd, lights, popper, projector, screen);


        homeTheaterFacade.watchMovie("Titanic");
        homeTheaterFacade.endMovie();

    }
}

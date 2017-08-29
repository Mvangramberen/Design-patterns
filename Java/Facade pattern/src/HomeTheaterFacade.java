/**
 * Created by Mickaël on 29/08/2017.
 */
public class HomeTheaterFacade {
    Amplifier amplifier;
    Dvd dvd;
    Lights lights;
    Popper popper;
    projector projector;
    Screen screen;

    public HomeTheaterFacade(Amplifier amplifier, Dvd dvd, Lights lights, Popper popper, projector projector, Screen screen) {
        this.amplifier = amplifier;
        this.dvd = dvd;
        this.lights = lights;
        this.popper = popper;
        this.projector = projector;
        this.screen = screen;
    }

    public void watchMovie(String movie){
        System.out.println("Get ready to watch your movie");
        popper.on();
        popper.pop();
        lights.on();
        lights.dim(20);
        screen.down();
        projector.on();
        projector.setInput("Dvd");
        projector.getInput();
        projector.wideScreenmode();
        amplifier.on();
        amplifier.setInput("Dvd");
        amplifier.setSurroundSound();
        amplifier.setVolume(5);
        dvd.on();
        dvd.play(movie);
    }

    public void endMovie(){
        System.out.println("Time to go to bed");
        popper.off();
        lights.off();
        screen.up();
        projector.off();
        amplifier.off();
        dvd.off();
    }
}

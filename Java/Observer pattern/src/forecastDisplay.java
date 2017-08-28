/**
 * Created by Mickaël on 28/08/2017.
 * Dit is een van de Observers die aangemaakt zullen worden. Hier wordt uiteindelijk alle data naartoe gestuurd
 * om deze dan in de juiste output te steken.
 */
public class forecastDisplay implements Observer, DisplayElement {
   private float pressure;

    // Subject zorgt ervoor dat weatherdata observers kan toevoegen, verwijderen en notifieeren.
    private Subject weatherData;

    public forecastDisplay(Subject weatherData){
        this.weatherData = weatherData;

        // Deze display registreren als observer
        weatherData.registerObserver(this);
    }

    // Een klasse die in de Observer interface is aangemaakt, wordt hier overschreven voor de juiste handelingen te doen.
    // Deze kunnen verschillen van observer tot observer
    @Override
    public void update(float temp, float humidity, float pressure) {
       this.pressure = pressure;
        display();
    }

    // Een klasse die in de DisplayElement interface is aangemaakt, wordt hier overschreven voor de juiste handelingen te doen.
    // Deze kunnen verschillen van observer tot observer
    @Override
    public void display() {
        if (pressure >= 50){
            System.out.println("\nFORECAST DISPLAY Huidige conditie:\n Hoog druk gebied ! Kans op neerslag! ");
     }
     else
        {
            System.out.println("\nFORECAST DISPLAY Huidige conditie:\n Laag druk gebied! Zachte wind en weinig tot geen neerslag");

        }
    }
}

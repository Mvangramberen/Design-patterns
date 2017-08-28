import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mickaël on 28/08/2017.
 */
public class WeatherData implements Subject {
    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    // Constructor voor weatherdata, Hier wordt een nieuwe arraylist aangemaakt voor alle observers in op te slaan.
    public WeatherData(){
        observers = new ArrayList();
    }

    // Nieuwe observer toevoegen aan de ArrayList (wordt nu gemonintored en door de notifier op de hoogte gebracht van veranderingen)
    @Override
    public void registerObserver(Observer o ){
        observers.add(o);
    }

    // Observer uit de arraylist verwijderen (wordt niet meer op de hoogte gehouden door de notifier)
    @Override
    public void removeObserver(Observer o){
        int i = observers.indexOf(o);

        // Controleren of dat de observer wel effectief geregistreerd staat in de arrayList
        if( i >= 0){
            observers.remove(i);
        }
    }


    // Alle observers worden geupdate en daarbij ook genotifieerd
    @Override
    public void notifyObserver(){
        for (Observer o: observers) {
            o.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged(){
        notifyObserver();
    }

    // De measurements worden hier geupdate, nadien worden al de observers via de notifier op de hoogte van de verandering gebracht.
    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}

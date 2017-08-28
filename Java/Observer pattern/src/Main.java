public class Main {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();


        // Aanmaken van de displays, deze worden automatisch geupdate door de observers.
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        forecastDisplay forecastDisplay = new forecastDisplay(weatherData);
        PressureDisplay pressureDisplay = new PressureDisplay(weatherData);


        // Weercondities aanpassen zodat de displays geupdate worden.
        weatherData.setMeasurements(15,65,30.4f);
        weatherData.setMeasurements(16,50,50.8f);
        weatherData.setMeasurements(17,25,20.6f);

    }
}

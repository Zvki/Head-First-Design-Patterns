package bartosz.sosnica.observer.Models;

import bartosz.sosnica.observer.Interfaces.InformationPanel;
import bartosz.sosnica.observer.Interfaces.Observer;

public class CurrentConditionsPanel implements Observer, InformationPanel {

    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionsPanel(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(){
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();
    }

    public void display(){
        System.out.println("Current conditions: " + temperature + "C degrees and " + humidity + "% humidity");
    }
    
}

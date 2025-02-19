package bartosz.sosnica.observer.Models;

import bartosz.sosnica.observer.Interfaces.InformationPanel;
import bartosz.sosnica.observer.Interfaces.Observer;

public class StatisticsPanel implements Observer, InformationPanel{

    private float temperature;
    private float humidity;
    private float pressure;
    private WeatherData weatherData;
    private float maxTemperature = 0;
    private float minTemperature = 200;
    private float temperatureSum = 0;
    private int numReadings;

    public StatisticsPanel(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(){
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        temperatureSum += temperature;
        numReadings++;

        if(temperature > maxTemperature){
            maxTemperature = temperature;
        }

        if(temperature < minTemperature){
            minTemperature = temperature;
        }

        display();
    }

    public void display(){
        System.out.println("Avg/Max/Min temperature = " + (temperatureSum / numReadings) + "/" + maxTemperature + "/" + minTemperature);
    }
    
}

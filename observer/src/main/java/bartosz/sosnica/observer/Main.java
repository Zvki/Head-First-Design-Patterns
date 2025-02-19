package bartosz.sosnica.observer;

import bartosz.sosnica.observer.Models.CurrentConditionsPanel;
import bartosz.sosnica.observer.Models.StatisticsPanel;
import bartosz.sosnica.observer.Models.WeatherData;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsPanel currentConditionsPanel = new CurrentConditionsPanel(weatherData);
        StatisticsPanel statisticsPanel = new StatisticsPanel(weatherData);

        weatherData.setMeasurements(25, 65, 1013);
        weatherData.setMeasurements(30, 70, 1012);
        weatherData.setMeasurements(35, 75, 1011);
    }
}
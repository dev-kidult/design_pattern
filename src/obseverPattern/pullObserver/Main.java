package obseverPattern.pullObserver;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        WeatherApp weatherApp = new WeatherApp(weatherData);

        weatherData.setMeasurements(30, 10, WeatherStatus.SUNNY);
        weatherApp.updateStatus();
    }
}

package obseverPattern.customObserver;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        Dehumidifier dehumidifier = new Dehumidifier(weatherData);
        WeatherApp weatherApp = new WeatherApp(weatherData);
        AirConditioner airConditioner = new AirConditioner(weatherData);

        weatherData.setMeasurements(30, 10, WeatherStatus.SUNNY);
        System.out.println("");
        weatherData.setMeasurements(23, 90, WeatherStatus.RAINY);
        System.out.println("");
        weatherData.setMeasurements(35, 55, WeatherStatus.CLOUDY);
    }
}

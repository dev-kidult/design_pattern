package obseverPattern.jdkObserver;

import java.util.Observable;

class WeatherData extends Observable {
    private double temperature; // 온도
    private double humidity; // 습도
    private WeatherStatus weatherStatus; // 날씨상태

    WeatherData() {
    }

    void setMeasurements(double temperature, double humidity, WeatherStatus weatherStatus) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.weatherStatus = weatherStatus;
        measurementsChanged();
    }

    private void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    double getTemperature() {
        return temperature;
    }

    double getHumidity() {
        return humidity;
    }

    WeatherStatus getWeatherStatus() {
        return weatherStatus;
    }
}

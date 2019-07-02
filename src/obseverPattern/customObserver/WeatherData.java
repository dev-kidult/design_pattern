package obseverPattern.customObserver;

import java.util.ArrayList;
import java.util.List;

class WeatherData implements Observable {
    private List<Observer> observers;
    private double temperature; // 온도
    private double humidity; // 습도
    private WeatherStatus weatherStatus; // 날씨상태


    @Override
    public void addObserver(Observer o) {
        this.observers.add(o);
    }

    @Override
    public void deleteObserver(Observer o) {
        this.observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(this));
    }

    WeatherData() {
        observers = new ArrayList<>();
    }

    void setMeasurements(double temperature, double humidity, WeatherStatus weatherStatus) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.weatherStatus = weatherStatus;
        measurementsChanged();
    }

    private void measurementsChanged() {
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

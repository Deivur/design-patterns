package com.idenys.pattern.observer;

import java.util.HashSet;
import java.util.Set;

public class WeatherStation implements Subject {

    private final Set<Observer> observers;
    public WeatherData weatherData;

    public WeatherStation() {
        this.observers = new HashSet<>();
    }

    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        this.observers.forEach(observer -> observer.update(this.weatherData));
    }

    public void setWeatherData(WeatherData weatherData) {
        this.weatherData = weatherData;
        notifyObservers();
    }
}

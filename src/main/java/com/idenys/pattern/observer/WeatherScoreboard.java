package com.idenys.pattern.observer;

public class WeatherScoreboard implements Display, Observer {

    private WeatherData data;

    @Override
    public void display() {
        System.out.println("Display: " + data);
    }

    @Override
    public void update(WeatherData data) {
        this.data = data;
        display();
    }
}

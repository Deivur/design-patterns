package com.idenys.pattern.observer;

public class ObserverRunner {

    public static void main(String[] args) {
        WeatherScoreboard w1 = new WeatherScoreboard();
        WeatherScoreboard w2 = new WeatherScoreboard();

        WeatherStation s = new WeatherStation();
        s.addObserver(w1);
        s.addObserver(w2);
        s.setWeatherData(new WeatherData());
    }
}

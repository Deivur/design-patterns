package com.idenys.pattern.observer;

import java.util.Random;
import java.util.UUID;

public class WeatherData {

    private final UUID id;
    private final String temperature;
    private final String humidity;

    public WeatherData() {
        this.id = UUID.randomUUID();
        this.temperature = "+" + new Random().nextInt(40) + " Celsius";
        this.humidity = String.valueOf(Math.random() * 100).substring(0, 4) + " %";
    }

    public String getTemperature() {
        return temperature;
    }

    public String getHumidity() {
        return humidity;
    }

    @Override
    public String toString() {
        return "WeatherData{" +
                "id=" + id +
                ", temperature='" + temperature + '\'' +
                ", humidity='" + humidity + '\'' +
                '}';
    }
}

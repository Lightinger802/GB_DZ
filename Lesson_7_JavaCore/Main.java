package Lesson_7;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        WeatherResponse weather = new WeatherResponse();
        weather.getWeather(Period.NOW);
        weather.getWeather(Period.FIVE_DAYS);

    }
}

package Lesson_7;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.io.StringReader;
@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherResponse {

    private static final String PROTOKOL = "https";
    private static final String BASE_HOST = "dataservice.accuweather.com";
    private static final String FORECASTS = "forecasts";
    private static final String VERSION = "v1";
    private static final String DAILY = "daily";
    private static final String ONE_DAY = "1day";
    private static final String FIVE_DAY = "5day";
    private static final String API_KEY = "fPyz6GNu2OSl5KvyHUOjtA1AoTMhfKR8";
    private static final String API_KEY_QUERY_PARAM = "apikey";
    private static final String METRIC = "metric";
    private static final String METRIC_VALUE = "true";

    private static final OkHttpClient okHttpClient = new OkHttpClient();
    private static final ObjectMapper objectMapper = new ObjectMapper();


    public void getWeather(@NotNull Period period) throws IOException {
        switch (period) {
            case NOW:
                HttpUrl httpUrl = new HttpUrl.Builder()
                        .scheme(PROTOKOL)
                        .host(BASE_HOST)
                        .addPathSegment(FORECASTS)
                        .addPathSegment(VERSION)
                        .addPathSegment(DAILY)
                        .addPathSegment(ONE_DAY)
                        .addPathSegment("2515330")
                        .addQueryParameter(API_KEY_QUERY_PARAM, API_KEY)
                        .addQueryParameter(METRIC, METRIC_VALUE)
                        .build();

                Request request = new Request.Builder()
                        .url(httpUrl)
                        .build();

                Response oneDayForecastResponse = okHttpClient.newCall(request).execute();
                String weatherResponse = oneDayForecastResponse.body().string();
                StringReader reader = new StringReader(weatherResponse);
                Weather weather = objectMapper.readValue(reader, Weather.class);
                System.out.println("Погода за один день");
                System.out.println("Текущая прогода: " + weather.getHeadline().getText());
                System.out.println(weather.getDailyForecasts());

                break;
            case FIVE_DAYS:
                HttpUrl httpUrlFiveDays = new HttpUrl.Builder()
                        .scheme(PROTOKOL)
                        .host(BASE_HOST)
                        .addPathSegment(FORECASTS)
                        .addPathSegment(VERSION)
                        .addPathSegment(DAILY)
                        .addPathSegment(FIVE_DAY)
                        .addPathSegment("2515330")
                        .addQueryParameter(API_KEY_QUERY_PARAM, API_KEY)
                        .addQueryParameter(METRIC, METRIC_VALUE)
                        .build();

                Request requestFiveDays = new Request.Builder()
                        .url(httpUrlFiveDays)
                        .build();

                Response FiveDayForecastResponse = okHttpClient.newCall(requestFiveDays).execute();
                String weatherResponseFiveDays = FiveDayForecastResponse.body().string();
                StringReader readerFiveDays = new StringReader(weatherResponseFiveDays);
                Weather weatherFiveDays = objectMapper.readValue(readerFiveDays, Weather.class);
                System.out.println("Погода за пять дней");
                System.out.println(weatherFiveDays.getDailyForecasts());

                break;
        }
    }

}

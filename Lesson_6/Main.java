package Lesson_6;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        URL urlCity = new URL("https://dataservice.accuweather.com/locations/v1/search.json?q=59.95,30.35&apikey=fPyz6GNu2OSl5KvyHUOjtA1AoTMhfKR8");
        Scanner inCity = new Scanner((InputStream) urlCity.getContent());
        StringBuilder resultCity = new StringBuilder();
        while (inCity.hasNext()){
            resultCity.append(inCity.nextLine());
        }
        System.out.println("Информация о городе");
        System.out.println(resultCity);

        URL url = new URL("https://dataservice.accuweather.com/forecasts/v1/daily/5day/2515330?apikey=fPyz6GNu2OSl5KvyHUOjtA1AoTMhfKR8");
        Scanner in = new Scanner((InputStream) url.getContent());
        StringBuilder result = new StringBuilder();
        while (in.hasNext()){
            result.append(in.nextLine());
        }
        System.out.println("Информация о погоде в городе");
        System.out.println(result);
    }
}

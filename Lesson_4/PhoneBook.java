package Lesson_4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private static HashMap<String, String> phoneBook = new HashMap<>();

    public static void addPerson (String phone, String name){
        phoneBook.put(phone, name);
    }

    public static void dellPerson (String phone){
        phoneBook.remove(phone);
    }

    public static void printPhonebook(){
        System.out.println("Телефонная книга");
        for (Map.Entry<String, String> k: phoneBook.entrySet()){
            System.out.println(k.getValue() + ": " + k.getKey());
        }
    }

    public static void findPersonPhone(String tel){
        System.out.println("Результаты поиска по номеру телефона");
        String result = phoneBook.get(tel);
        if (result == null){
            System.out.println("Абонент с таким номером не найден");
        } else System.out.println("Имя: " + result);
    }

    public static void findPersonName(String name){
        System.out.println("Результаты поиска по имени абонента");
        List<String> resultName = new ArrayList<>();
        for (Map.Entry entry: phoneBook.entrySet()){
            if (name.equalsIgnoreCase((String) entry.getValue())){
                resultName.add((String) entry.getKey());
            }
        }
        if (resultName.size() == 0){
            System.out.println("Абонент с таким именем не найден");
        }else {
            String[] wordsArray = resultName.toArray(new String[0]);
            for (String word : wordsArray){
                System.out.println("Телефон: " + word);
            }
        }
    }
}

package Lesson_4;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("Кот", "Собака", "Слон", "Корова", "Слон", "Кит",
                "Крокодил","Кит", "Собака", "Кот"));

        arrayList.add("Кот");

        nameSearch(arrayList);
        
        //Создание телефонной книги
        PhoneBook.addPerson("+79991118822", "Alex");
        PhoneBook.addPerson("+79991118833", "Tom");
        PhoneBook.addPerson("+79991118844", "Vlad");
        PhoneBook.addPerson("+79991118855", "Mike");
        PhoneBook.addPerson("+79991118866", "Antony");
        PhoneBook.addPerson("+79991118877", "Simon");
        PhoneBook.addPerson("+79991118888", "Tim");
        PhoneBook.addPerson("+79991118899", "Robert");
        PhoneBook.addPerson("+79991118824", "Alex");
        PhoneBook.addPerson("+79991118826", "Alex");
        PhoneBook.addPerson("+79991118828", "Wilson");
        //Вывод на экран телефонной книги
        PhoneBook.printPhonebook();
        //Удаление абонента по номеру телефона
        PhoneBook.dellPerson("+79991118826");
        PhoneBook.printPhonebook();
        //Поиск абонента по номеру телефона
        PhoneBook.findPersonPhone("+79991118828");
        //Поиск абонена по имени
        PhoneBook.findPersonName("Alex");
    }

    public static void nameSearch(ArrayList<String> A){
        Set<String> unique = new HashSet<>(A);
        System.out.println("Исходный массив");
        System.out.println(A);
        System.out.println("Уникальные слова");
        System.out.println(unique);
        System.out.println("Как часто встречаются слова");
        for (String key : unique){
            System.out.println(key + ": " + Collections.frequency(A, key));
        }
    }

}

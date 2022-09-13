package Lesson_5;

public class DZ_Lesson_5 {
    public static void main(String[] args) {
        Stuff[] PersonArray = new Stuff[5];
        PersonArray[0] = new Stuff("Иванов Иван Иванович", "Инженер", "test@test.ru", "+79998889999", 100000, 30);
        PersonArray[1] = new Stuff("Петров Петр Петрович", "Конструктор", "test_1@test.ru", "+79997779999", 150000, 40);
        PersonArray[2] = new Stuff("Сидоров Сидр Сидорович", "Техник", "test_2@test.ru", "+77778889999", 80000, 45);
        PersonArray[3] = new Stuff("Тестер Тест Тестович", "Технолог", "test_3@test.ru", "+79996669999", 110000, 50);
        PersonArray[4] = new Stuff("Тестович Тестер Иванович", "Тестер", "test_4@test.ru", "+75558889999", 90000, 55);

        for (int i = 0; i < 5; i++){
            if (PersonArray[i].Age > 40) {
                PersonArray[i].getStuffInformation();
            };
        }
    }
}


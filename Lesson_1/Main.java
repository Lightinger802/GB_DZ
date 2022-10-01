package Lesson_1;

public class Main {

    public static void main(String[] args) {
        Team[] Wolf = {new Team("Wolf", "One", 3), new Team("Wolf", "Two", 4), new Team("Wolf", "Three", 2)};
        Course[] course = {new Road("Road", 10), new Forest("Forest",20), new CrossRoad("CrossRoad",5)};

        for (int i = 0; i < Wolf.length; i++) {
            System.out.println(Wolf[i]);
        }

        for (Team team : Wolf) {
           for (Course courseI : course) {
               courseI.getTimeToOvercome(team);
            }
        }

    }
}






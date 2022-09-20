package Lesson_6;

public class Dog extends Animal {
    private String name;
    private static int count;
    Dog(String name){
        this.name = name;
        count++;
    }

    @Override
    void run(int range) {
        if (range <= 500){
            System.out.printf("Собака %s пробежала %s метров %n", name, range);
        } else {
            System.out.printf("Собака %s может пробежать только 500 метров %n", name);
        }
    }

    @Override
    void swim(int range) {
        if (range <= 10){
            System.out.printf("Собака %s проплыла %s метров %n", name, range);
        } else {
            System.out.printf("Собака %s может проплыть только 10 метров %n", name);
        }
    }

    public static int getCount() {
        return count;
    }
}

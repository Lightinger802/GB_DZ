package Lesson_6;

public class Cat extends Animal {
    private String name;
    private static int count;
    Cat(String name){
        this.name = name;
        count++;
    }

    @Override
    void run(int range) {
        if (range <= 200){
            System.out.printf("Кот %s пробежал %s метров %n", name, range);
        } else {
            System.out.printf("Кот %s может пробежать только 200 метров %n", name);
        }
    }

    @Override
    void swim(int range) {
        System.out.printf("Кот %s не умеет плавать %n", name);
    }

    public static int getCount() {
        return count;
    }
}

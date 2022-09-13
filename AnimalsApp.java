package Lesson_6;

public class AnimalsApp {
    public static void main(String[] args) {
        Cat catBarsik = new Cat("Барсик");
        Cat catMurzik = new Cat("Мурзик");
        Dog dogSharik = new Dog("Шарик");

        catBarsik.run(200);
        catMurzik.run(150);
        catBarsik.swim(10);
        catMurzik.swim(20);
        dogSharik.run(500);
        dogSharik.swim(10);

        System.out.printf("Всего котов: %s %n", Cat.getCount());
        System.out.printf("Всего собак: %s %n", Dog.getCount());
        System.out.printf("Всего животных: %s %n", (Cat.getCount() + Dog.getCount()));
    }
}

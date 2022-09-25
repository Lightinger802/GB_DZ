package Lesson_7;

public class Main {
    public static void main(String[] args) {
        Cat[] catArray = new Cat[5];
        catArray[0] = new Cat("Barsik", 15, false);
        catArray[1] = new Cat("Murzik", 20, false);
        catArray[2] = new Cat("Lastik", 15, false);
        catArray[3] = new Cat("Vasilyi", 10, false);
        catArray[4] = new Cat("Kreker", 20, false);

        Plate plate = new Plate(50);
        plate.info();
        for (int i = 0; i < 5; i++){
            catArray[i].eat(plate) ;
        }
        for (int i = 0; i < 5; i++){
            catArray[i].info();
        }
        plate.addFood(10);
        plate.info();
    }
}

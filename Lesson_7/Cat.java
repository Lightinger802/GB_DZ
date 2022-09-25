package Lesson_7;

public class Cat {
    private String name;
    private int appetite;
    private boolean well_fed;

    public Cat(String name, int appetite, boolean well_fed) {
        this.name = name;
        this.appetite = appetite;
        this.well_fed = well_fed;
    }

    public void eat(Plate p) {
        if (p.food > appetite) {
            p.decreaseFood(appetite);
            well_fed = true;
            System.out.printf("Кот %s поел %n", name);
        } else {
            System.out.printf("В тарелке мало еды для кота %s %n", name);
        }
    }

    public void info() {
        if (well_fed == false) {
            System.out.printf("Кот %s голоден %n", name);
        } else {
            System.out.printf("Кот %s сыт %n", name);
        }
    }
}

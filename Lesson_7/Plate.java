package Lesson_7;

public class Plate {
    protected int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {
        food -= n;
    }

    public void info() {
        System.out.println("plate: " + food);
    }

    public void addFood (int c){
        food += c;
    }
}

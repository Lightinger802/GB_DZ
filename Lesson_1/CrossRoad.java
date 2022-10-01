package Lesson_1;

public class CrossRoad extends Course implements Courses{
    private String name;
    private int length;
    public CrossRoad(String name, int length){
        super(length);
        this.name = name;
        this.length = length;
    }


    public int getLength() {
        return length;
    }

    public void setLength(int height) {
        this.length = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Wall{" +
                "height=" + length +
                '}';
    }

    public void getTimeToOvercome(Team team) {
        team.run(this);
    }
}

package Lesson_1;

public class Road extends Course implements Courses{
    private String name;
    private int length;

    public Road(String name, int length){
        super(length);
        this.name = name;
        this.length = length;
    }


    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Road{" +
                "length=" + length +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getTimeToOvercome(Team team) {
        team.run(this);
    }
}

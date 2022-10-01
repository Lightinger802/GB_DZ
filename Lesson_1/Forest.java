package Lesson_1;

public class Forest extends Course implements Courses{
    private String name;
    private int length;

    public Forest(String name, int length){
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "River{" +
                "length=" + length +
                '}';
    }

    public void getTimeToOvercome(Team team) {
        team.run(this);
    }
}

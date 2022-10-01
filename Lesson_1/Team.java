package Lesson_1;

public class Team implements CanRun {
    private final String teamName;
    private final String memberName;
    private final int memberSpeed;

    public Team(String teamName, String memberName, int memberSpeed){

        this.teamName = teamName;
        this.memberName = memberName;
        this.memberSpeed = memberSpeed;
    }

    public String getTeamName() {
        return teamName;
    }

    public String getMemberName() {
        return memberName;
    }

    public int getMemberSpeed() {
        return memberSpeed;
    }

    @Override
    public String toString() {
        return "Team{" +
                "teamName='" + teamName + '\'' +
                ", memberName='" + memberName + '\'' +
                ", memberSpeed=" + memberSpeed +
                '}';
    }


    @Override
    public double run(Road road) {
        double timeTimeToOvercome = road.getLength()/getMemberSpeed();
        System.out.printf("Участник %s прошел дистанцию %s за " + timeTimeToOvercome + " минут %n", getMemberName(), road.getName());
        return timeTimeToOvercome;
    }

    @Override
    public double run(Forest forest) {
        double timeTimeToOvercome = forest.getLength()/getMemberSpeed();
        System.out.printf("Участник %s прошел дистанцию %s за " + timeTimeToOvercome + " минут %n", getMemberName(), forest.getName());
        return timeTimeToOvercome;
    }

    @Override
    public double run(CrossRoad crossRoad) {
        double timeTimeToOvercome = crossRoad.getLength()/getMemberSpeed();
        System.out.printf("Участник %s прошел дистанцию %s за " + timeTimeToOvercome + " минут %n", getMemberName(), crossRoad.getName());
        return timeTimeToOvercome;
    }
}

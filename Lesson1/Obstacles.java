public class Obstacles {
    private String nameObstacles;
    private int runValue;
    private int jumpValue;
    private int swimValue;

    public Obstacles(String nameObstacles, int runValue, int jumpValue, int swimValue) {
        this.nameObstacles = nameObstacles;
        this.runValue = runValue;
        this.jumpValue = jumpValue;
        this.swimValue = swimValue;
    }

    public int getRunValue() {
        return runValue;
    }

    public int getJumpValue() {
        return jumpValue;
    }

    public int getSwimValue() {
        return swimValue;
    }
}

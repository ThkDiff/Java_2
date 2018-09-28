public class TeamMember {
    private String name;
    private int run;
    private int jump;
    private int swim;
    private int trackResult;

    public TeamMember(String name, int run, int jump, int swim, int trackResult) {
        this.name = name;
        this.run = run;
        this.jump = jump;
        this.swim = swim;
        this.trackResult = trackResult;
    }

    public int getRun() {
        return run;
    }

    public int getJump() {
        return jump;
    }

    public int getSwim() {
        return swim;
    }

    public int getTrackResult() {
        return trackResult;
    }

    public String getName() {
        return name;
    }

    public void enlargeResult(){
        trackResult++;
    }
}
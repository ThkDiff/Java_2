public class Team {
    private String teamName;
    private int teamResult = 0;

    public Team(String teamName) {
        this.teamName = teamName;
    }

    TeamMember[] teamMembers = { new TeamMember("Vladimir", 10,5,7,0),
            new TeamMember("Alex",5,3,10,0),
            new TeamMember("Rebecca", 7,7,9,0),
            new TeamMember("Tom",3,4,2,0),
            new TeamMember("Arnold", 5,6,6,0)};

    public void showResultEachMember(){
        for (TeamMember t : teamMembers)
            System.out.println(t.getName() + " -> " + t.getTrackResult());
    }

    public void showTeamResult(){
        for (TeamMember t : teamMembers)
            teamResult += t.getTrackResult();
        System.out.println(teamName + " -> " + teamResult);
    }

    public void passMembers(){
        System.out.println("People, who pass the entire course");
        for (TeamMember t : teamMembers)
            if (t.getTrackResult() == 3)
                System.out.println(t.getName());

    }

}

import java.util.Random;

public class Course {
    Random random = new Random();

   Obstacles[] obstacles = { new Obstacles("run", random.nextInt(10),0,0),
   new Obstacles("jump",0, random.nextInt(10),0),
   new Obstacles("swim",0,0, random.nextInt(10))};

    public void goTeam(Team team){
        for (int i = 0;i < team.teamMembers.length;i++)
            for (int j = 0;j< obstacles.length;j++)
                if (team.teamMembers[i].getRun() >= obstacles[j].getRunValue() &&
                        team.teamMembers[i].getJump() >= obstacles[j].getJumpValue() &&
                        team.teamMembers[i].getSwim() >= obstacles[j].getSwimValue())
                    team.teamMembers[i].enlargeResult();
    }

}










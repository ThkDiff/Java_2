public class Homework1 {
    public static void main(String[] args){
    Team tt = new Team("Victoria");
    Course cc = new Course();
    cc.goTeam(tt);
    tt.showResultEachMember();
    tt.showTeamResult();
    tt.passMembers();
    }
}


public class Coach {
    String Name;
    Team Team;
    String Sport;

    public void introduce_self(){
        System.out.println("My name is " + Name);
    }
    public void introduce_team(){
        System.out.println("I coach for the " +Team.team);
    }
    public void declare_win(){
        System.out.println("And we will win this " +Sport);
    }
    public void declare_win2(){
        System.out.println("And we will beat the " +Team+ "  And take the Championship");
    }
}
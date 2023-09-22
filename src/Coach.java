
public class Coach {
    String name;
    Team team;

    String sport;

    public void introduce_self(){
        System.out.println("My name is " + name);
    }
    public void introduce_team(){
        System.out.println("I coach for the " +team.team);
    }
    public void declare_win(){
        System.out.println("And we will win this " +sport);
    }
    public void declare_win2(){
        System.out.println("And we will beat the " +team+ "  And take the Championship");
    }
}
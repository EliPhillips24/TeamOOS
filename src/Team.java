import java.util.ArrayList;

class Team {

     final private ArrayList<Player> players;
   private String team;
    private Coach coach;


     public Team(Player player, String team, Coach coach) {
         this.team = team;
         this.coach = coach;
         this.players = new ArrayList<Player>();
     }

     public void Player() {
        System.out.println("This team has " +players+ "on it");
    }
    public void TeamName() {
        System.out.println("This is the " +team);
    }
    public void Coach() {
        System.out.println("This team's coach is " +coach.name);
    }
}

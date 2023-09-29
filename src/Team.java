import java.util.ArrayList;
//Brandon
class Team {

    final private ArrayList<Player> players;
    final private String team;
    final private Coach coach;


     public Team(Player players, String team, Coach coach) {
         this.team = team;
         this.coach = coach;
         this.players = new ArrayList<>();
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
    public void addPlayers(Player newPlayer) {
        this.players.add(newPlayer);
    }
}


public class Team {

    Player player;
    String team;
    Coach coach;

    public void Player() {
        System.out.println("This team has " +player.name+ "on it");
    }
    public void TeamName() {
        System.out.println("This is the " +team);
    }
    public void Coach() {
        System.out.println("This team's coach is " +coach.Name);
    }
}

public class Main {
    public static void main(String[] args) {


        Coach coach1 = new Coach();
        coach1.Name = "Brad Chase";
        coach1.introduce_self();
        coach1.Team = "Bronvill Weasels";
        coach1.introduce_team();
        coach1.Sport = "Soccer Tournament";
        coach1.declare_win();

        Coach coach2 = new Coach();
        coach2.Name = "Justin Netenhao";
        coach2.introduce_self();
        coach2.Team = "Danville Ponchos";
        coach2.introduce_team();
        coach2.Sport = "Bronvill Weasels";
        coach2.declare_win2();
    }
}
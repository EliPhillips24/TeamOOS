public class Main {
    public static void main(String[] args) {

        Ref ref1 = new Ref();
        Ref ref2 = new Ref();
        Match match1 = new Match();
        Coach coach1 = new Coach();
        Coach coach2 = new Coach();
        Player player1 = new Player("Rearden Walker", "Bronvill Weasels", "Soccer", coach1);
        Player player2 = new Player("Price Watt", "Danville Ponchos", "Soccer", coach2);
        Team team1 = new Team(player1,"Bronvill Weasels", coach1);
        Team team2 = new Team(player2, "Danville Ponchos", coach2);

        ref1.name = "Mr. Big";
        ref1.name();
        ref1.sport = " Soccer";
        ref1.sport();
        ref1.year = 10;
        ref1.year();

        ref2.name = "Mr. Small";
        ref2.name();
        ref2.sport = " Soccer";
        ref2.sport();
        ref2.year = 7;
        ref2.year();

        match1.teams = "Danville Ponchos and Bronvill Weasels";
        match1.teams();
        match1.date="september 14th";
        match1.date();
        match1.location = "Bronvill Weasels stadium";
        match1.location();

        coach1.name = "Brad Chase";
        coach1.introduce_self();
        coach1.team = team1;
        coach1.introduce_team();
        coach1.sport = "Soccer Tournament";
        coach1.declare_win();

        coach2.name = "Justin Netenhao";
        coach2.introduce_self();
        coach2.team = team2;
        coach2.introduce_team();
        coach2.sport = "Danville Ponchos";
        coach2.declare_win2();

        player1.Name();
        player1.Team();
        player1.Sport();
        player1.Coach();

        player2.Name();
        player2.Team();
        player2.Sport();
        player2.Coach();

        team1.TeamName();
        team1.Player();
        team1.Coach();

        team2.TeamName();
        team2.Player();
        team2.Coach();




    }







    }
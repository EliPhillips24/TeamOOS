public class Main {
    public static void main(String[] args) {

        Ref ref1 = new Ref();
        ref1.name = "Mr. Big";
        ref1.name();

        ref1.sport = " Soccer";
        ref1.sport();
        ref1.year = 10;
        ref1.year();


        Ref ref2 = new Ref();
        ref2.name = "Mr. Small";
        ref2.name();

        ref2.sport = " Soccer";
        ref2.sport();
        ref2.year = 7;
        ref2.year();

        Player player1 = new Player();
        player1.name = "Rearden Walker";
        player1.Name();
        player1.team = "Bronvill Weasels";
        player1.Team();
        player1.sport = "Soccer";
        player1.Sport();

        Player player2 = new Player();
        player2.name = "Price Watt";
        player2.Name();
        player2.team = "Danville Ponchos";
        player2.Team();
        player2.sport = "Soccer";
        player2.Sport();

        Match match1 = new Match();
        match1.teams = "Danville Ponchos and Bronvill Weasels";
        match1.teams();
        match1.date="september 14th";
        match1.date();
        match1.location = "Bronvill Weasels stadium";
        match1.location();

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
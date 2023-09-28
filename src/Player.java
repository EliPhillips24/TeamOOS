 class Player {
    private String name;
     private String team;
     private String sport;
     private Coach coach;

     public Player(String name, String team, String sport, Coach coach) {
         this.name = name;
         this.team = team;
         this.sport = sport;
         this.coach = coach;
     }

    public void Name(){
        System.out.println("Hi everyone! My name is " +name);

    }
    public void Team(){
        System.out.println("Hi everyone! I play for " +team);
    }

    public void Sport(){
        System.out.println("Hi everyone! I play " +sport);
    }

    public void Coach(){
        System.out.println("My Coach is " +coach.name);
    }
}



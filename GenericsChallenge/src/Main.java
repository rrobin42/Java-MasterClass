public class Main {
    public static void main(String[] args) {
League<BasketballTeam> nba = new League<>("NBA");
League<SoccerTeam> soccer = new League<>("Soccer");

BasketballTeam thunder = new BasketballTeam("Thunder", 3, 0);
BasketballTeam hornets = new BasketballTeam("Hornets", 2, 1);
BasketballTeam bulls = new BasketballTeam("Bulls", 1, 2);

SoccerTeam usa = new SoccerTeam("USA",5, 2);
SoccerTeam nigeria = new SoccerTeam("Nigeria", 6, 3);
SoccerTeam cameroon = new SoccerTeam("Cameroon",8, 2);

nba.addTeam(thunder);
nba.addTeam(hornets);
nba.addTeam(bulls);

soccer.addTeam(usa);
soccer.addTeam(nigeria);
soccer.addTeam(cameroon);

nba.printTeams();
soccer.printTeams();
    }
}

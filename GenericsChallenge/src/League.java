import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team>{
    private String name;
    private ArrayList<T> teams;

    public League(String name) {
        this.name = name;
        this.teams = new ArrayList<>();
    }

    public void addTeam(T team){
        //CHECK IF TEAM IS ALREADY IN THE LIST
        if(teams.contains(team)){
            System.out.println(team + " is already in the league.");
        }
        else{
            teams.add(team);
            System.out.println(team + " has been added to the league");
        }
    }

    public void printTeams(){
        Collections.sort(teams);
        for (Team team: teams) {
            System.out.println(team.getName() + ": Wins - " + team.getWins());
        }
    }

}

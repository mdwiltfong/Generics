import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team>   {
private ArrayList<T> teams = new ArrayList<>();
private String name;


    public League(String name) {
        this.name = name;
    }
    public boolean addTeam(T team){
        return this.teams.add(team);
    }
    public void printTeam(){
        Collections.sort(teams);
        System.out.println("Teams that are part of "+this.name);
        for (T team :
                this.teams) {
            System.out.println(team.getName());
        }
    }

    public ArrayList<T> getTeams() {
        return teams;
    }

    public String getName() {
        return name;
    }
}

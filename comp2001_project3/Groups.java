import java.util.ArrayList;
import java.util.Random;

/**
 * Class stores 6 different teams ands stores the matches between these
 * teams
 */
public class Groups
{
    // instance variables - replace the example below with your own
    private String name;
    private Team[] teams;
    private ArrayList<Match> matches;
    /**
     * Constructor for objects of class Group
     */
    public Groups()
    {
        this.name = name; 
        teams = new Team[4];
        matches = new ArrayList<>();
    }
    /**
     * Accessors and mutators for instance variables
     */
    public String getName(){
        return name;
    }
    public Team[] getTeams(){
        return teams;
    }
    public void addTeam(int index,Team team){
        teams[index] = team;
    }
    public void setName(String name){
        this.name = name;
    }
    
    /**
     * Adds a match to arrayList with the score for both teams
     */
    public void addMatch(int t1Score,int t2Score){
        matches.add(new Match(teams,t1Score,t2Score));
    }
    /**
     * returns a string with the points and goals of each team
     */
    public String calculateRanking(){
        String q = "Group '"+getName()+"' Rankings:\n";
        for(Team team : teams){
            q += team.getName()+" has "+team.getPoints()+" points and "+team.getGoals()+" goals.";
        }
        return q;
    }
}    

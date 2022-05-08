import java.util.Random;
import java.util.*;
/**
 * This class generates a soccer team object containing  instance variables of Country, 23 randomly created names of players, 
 * and a randomly generated coach name.
 */
public class Team
{
    protected String country;
    private NameGenerator[] players;
    private NameGenerator coach;
    private int goals;
    private int points;
    private String[] countries;
    
     
    /**
     * Constructor for objects of class Team
     */
    public Team()
    {
        this.players= new NameGenerator[23];
        players = setTeam();
        this.coach= new NameGenerator();
        countries = new String[]{"Spain","Italy","Argentina","Brazil","Portugal",
            "Zimbabwe","Jamaica","France","Egypt","Bangladesh",
            "Australia","Canada","Mexico","China","Indonesia",
            "Switzerland","India","Greece","England","Germany",
            "Palestine","Japan","Denmark","Afghanistan"};
        this.country=setCountry();
    }
    /**
     * return country of the team
     */
    public String getName(){
        return country;
    }
    /**
     * returns number of scored goals
     */
    public int getGoals(){
        return goals;
    }
    /**
     * returns points
     */
    public int getPoints(){
        return points;
    }
    /**
     *
     *
     * @param
     * @generates a random team with random 23 players
     */
    public NameGenerator[] setTeam(){
        for(int i=0; i<23;i++){
            NameGenerator player= new NameGenerator();
            players[i]=player;
        }
        return players;
    }
    /**
     * randomly assigns country to a random team created
     */
    public String setCountry(){    
        Random rand= new Random();
        int index= rand.nextInt(countries.length);
        String country=countries[index];
        
        for (int i = index; i < countries.length - 1; i++) {
            countries[i] = countries[i + 1];
        }
        return country;

    }
    /**
     * Methods to keep track of all the goals and points during a match
     */
    public void sumGoals(int newGoal){
        goals += newGoal;
    }
    public void sumPoints(int newPoint){
        points += newPoint;
    }
}
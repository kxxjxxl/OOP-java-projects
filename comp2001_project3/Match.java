import java.util.Random;
/**
 * Randomizes a match between two teams in a group, while updating
 * each teams points and goals after the match concludes
 */
public class Match
{
    private Team t1;
    private Team t2;
    private int t1Score;
    private int t2Score;
    private Team[] teams;

    /**
     * Constructor for objects of class Match which updates the points and goals 
     * There are counters for both teams when a match is created
     */
    public Match(Team[] teams,int t1Score, int t2Score)
    {
        // initializing instance variables
        this.teams = teams;
        t1= randomTeam();
        t2= randomTeam();
        t1Score = t1Score;
        t2Score = t2Score;
        t1.sumGoals(t1Score);
        t2.sumGoals(t2Score);
        t1.sumPoints(t1Score/10);
        t2.sumPoints(t2Score/10);
        if(t1Score > t2Score){ //if team 2 wins, award them 3 points
            t1.sumPoints(3);
        } else if(t2Score > t1Score){ //if team 2 wins, award them 3 points
            t2.sumPoints(3);
        } else {//at a draw, award 1 point to each team
            t1.sumPoints(1);
            t2.sumPoints(1);
        }
    }
    /**
     * Accessors for instance variables
     */
    public Team getTeam1(){
        return t1;
    }
    public Team getTeam2(){
        return t2;
    }
    public int getTeam1Score(){
        return t1Score;
    }
    public int getTeam2Score(){
        return t2Score;
    }

    /**
     * returns a random team from the group
     */
    public Team randomTeam()
    {
        Random rand=new Random();
        int teamIndex= rand.nextInt(4);
        teams[teamIndex] = teams[teamIndex + 1];
        Team randTeam= teams[teamIndex];
        return randTeam;
    }
}
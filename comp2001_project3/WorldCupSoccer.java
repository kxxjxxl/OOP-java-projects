import java.util.Random;

/**
 * Distributes teams into 6 different groups with 4 teams each
 * with methods for simulating 30 random matches and printing the results
 */
public class WorldCupSoccer
{
    private Groups[] groups;

    /**
     * Constructor for objects of class WorldCup
     */
    public WorldCupSoccer()
    {
        // initialise instance variables
        groups = new Groups[6];
        worldCupSetup();
    }

    /**
     * Sorts 24 teams into 6 groups with 4 teams each
     */
    public void worldCupSetup()
    {
        String[] groupNames = {"Alpha","Bravo","Charlie","Delta","Echo","Foxtrot"};
        for(int i=0;i<6;i++){
            Groups group = new Groups();
            group.setName(groupNames[i]);
            groups[i] = group;
            for(int j=0;j<4;j++){
                group.addTeam(j,new Team());
            }    
            }
    }
    /**
     * 30 matches are played with 5 matches played per game
     */
    public void randomMatches(){
        Random rand = new Random();
        for(Groups group : groups){
            for(int i =0;i<5;i++){
                group.addMatch(rand.nextInt(10),rand.nextInt(10));
            }
        }
    }
    /**
     * print all the results of all the random matches
     */
    public void calculateRanking(){
        for(Groups group : groups){
            System.out.println(group.calculateRanking());
        }
    }
}

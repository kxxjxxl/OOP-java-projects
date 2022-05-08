import java.util.Random;
/**
 * A class that generates random names for coaches and players
 */
public class NameGenerator
{
    private String name;

    /**
     * Constructor for objects of class Player
     */
    public NameGenerator()
    {
        name = randomPlayerGenerator();
}
    

    /**
     *
     * @param  y  a sample parameter for a method
     * @return the sum of x and y
     */
    public String randomPlayerGenerator()
    {
        // initialise instance variables
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random rand = new Random();
        int len = rand.nextInt(10); //creates an integer number with upperbound of 10
    StringBuilder str = new StringBuilder(len);
    for (int j = 0; j < len; j++){
    str.append(chars.charAt(rand.nextInt(chars.length())));
}
      
    return str.toString();    
}
}
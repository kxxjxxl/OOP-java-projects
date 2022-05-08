

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class SalesItemTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class SalesItemTest
{
    /**
     * Default constructor for test class SalesItemTest
     */
    public SalesItemTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    { 
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }





    @Test
    public void testSalesItemCreate()
    {
        SalesItem salesIte1 = new SalesItem("Macbook Pro", 350000);
        assertEquals("Macbook Pro", salesIte1.getName());
        assertEquals(350000, salesIte1.getPrice());
        salesIte1.removeComment(0);
    }

    @Test
    public void testAddComment()
    {
        SalesItem salesIte1 = new SalesItem("Macbook Pro", 350000);
        assertEquals(true, salesIte1.addComment("Emad", "This is a nice laptop", 4));
        assertEquals(true, salesIte1.addComment("Jairaj", "This is a great laptop", 1));
        assertEquals(true, salesIte1.addComment("Abhijeet", "This is a big laptop", 5));
        assertEquals(false, salesIte1.addComment("Noor", "The color for this laptop is nice", 0));
        assertEquals(false, salesIte1.addComment("Rishi", "So this laptop is bad", 6));
        assertEquals(false, salesIte1.addComment("Emad", "So this laptop is bad", 6));
    
    }



    @Test
    public void testRemoveComment()
    {
        SalesItem salesIte1 = new SalesItem("Macbook Pro", 350000);
        assertEquals(true, salesIte1.addComment("Emad", "Nice laptop", 5));
        salesIte1.removeComment(0);
        assertEquals(0, salesIte1.getNumberOfComments());
        assertEquals(true, salesIte1.addComment("Emad", "Nice laptop", 5));
    }

    @Test
    public void testCommentNumber()
    {
        SalesItem salesIte1 = new SalesItem("Macbook Pro", 350000);
        assertEquals(true, salesIte1.addComment("Emad", "Grape", 4));
        assertEquals(true, salesIte1.addComment("Rishi", "Not Grape", 3));
        assertEquals(true, salesIte1.addComment("Jairaaj", "Nice laptop, would buy", 4));
        salesIte1.removeComment(2);
        assertEquals(2, salesIte1.getNumberOfComments());
    }

    @Test
    public void testUpVote()
    {
        SalesItem salesIte1 = new SalesItem("Macboojk Pro", 350000);
        assertEquals(true, salesIte1.addComment("Emad", "This is the society we live in", 4));
        salesIte1.upvoteComment(0);
        salesIte1.upvoteComment(0);
    }
    

    @Test
    public void testDownVote()
    {
        SalesItem salesIte1 = new SalesItem("Emad", 350000);
        assertEquals(true, salesIte1.addComment("Rishi", "Great person", 4));
        salesIte1.downvoteComment(0);
        salesIte1.downvoteComment(3);
    }

    @Test
    public void testMostHelpful()
    {
        SalesItem salesIte1 = new SalesItem("macbook pro", 30000);
        assertEquals(true, salesIte1.addComment("Emad", "This is the world", 4));
        assertEquals(true, salesIte1.addComment("Rishi", "niceeeeee", 4));
        assertEquals(true, salesIte1.addComment("Jairajj", "nice bro", 5));
        assertEquals(3, salesIte1.getNumberOfComments());
        salesIte1.upvoteComment(0);
        salesIte1.upvoteComment(0);
        salesIte1.upvoteComment(0);
        salesIte1.upvoteComment(1);
        assertEquals(0, salesIte1.findMostHelpfulComment());
    }

    

    @Test
    public void testCommentCreate()
    {
        Comment comment1 = new Comment("Emad", "This is a 5", 5);
        assertEquals("Emad", comment1.getAuthor());
        assertEquals(5, comment1.getRating());
        comment1.upvote();
        comment1.upvote();
        assertEquals(2, comment1.getVoteCount());
    }

    @Test
    public void testVoting()
    {
        Comment comment1 = new Comment("Emad", "This is a test", 4);
        comment1.upvote();
        comment1.upvote();
        comment1.upvote();
        comment1.upvote();
        comment1.downvote();
        assertEquals(3, comment1.getVoteCount());
    }
}














package Domain; /**
 * Created by Jameshuang on 10/5/16.
 */

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

//Test likeornot function
//True should be returned for all locations
public class VisitorTest {
    @Test
    public void testProfessorlikes(){
        Visitor v = new Professor(3);
        assertTrue(v.like_dislike("The Cathedral of Learning"));
        assertTrue(v.like_dislike("The Point"));
        assertTrue(v.like_dislike("Squirrel Hill"));
        assertTrue(v.like_dislike("Downtown"));
    }
    //Test type()
    //Businessman should be returned
    @Test
    public void testVisitorType(){
        Visitor v = new Businessman(3);
        assertEquals(v.type(), "Businessman");
    }
}
package Domain;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Jameshuang on 10/6/16.
 */
//Test type()
//Test if visitor's type is equal to Blogger
//Blogger should be returned
public class BloggerTest {
    @Test
    public void Bloogertest(){
        Blogger b = new Blogger(1);
        assertEquals(b.type(), "Blogger");
    }
}

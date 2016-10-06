package Domain;

/**
 * Created by Jameshuang on 10/6/16.
 */


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import static org.junit.Assert.*;

public class CitySim9002Test {
    @Mock
    CitySim9002 cs = Mockito.mock(CitySim9002.class);

    @Before
    public void setUp() throws Exception{
        MockitoAnnotations.initMocks(cs);
    }

    @After
    public void tearDown() throws Exception{
    }

    //Test if input is not integer, false will be return
    @Test
    public void testcheckInputifNotInteger(){
        Mockito.when(cs.checkInput(new String[]{"aaa"})).thenCallRealMethod();
        assertFalse(cs.checkInput(new String[]{"aaa"}));
    }

    //Test when input is 10
    @Test
    public void testcheckInputifWrongInteger(){
        Mockito.when(cs.checkInput(new String[]{"aaa"})).thenCallRealMethod();
        assertFalse(cs.checkInput(new String[]{"aaa"}));
    }


    //Test if student will like squirrel hill if he went to it
    //Doubles and Stub are used in this test.
    //CallRealMethod() is used to mock some methods without mocking others
    @Test
    public void testRightLocationAndRightLike(){
        Visitor v = Mockito.mock(Student.class);
        String loc = "Squirrel Hill";
        Mockito.when(v.like_dislike(loc)).thenReturn(true);
        Mockito.when(cs.visit(v,loc)).thenCallRealMethod();
        assertTrue(cs.visit(v,loc));
    }
}

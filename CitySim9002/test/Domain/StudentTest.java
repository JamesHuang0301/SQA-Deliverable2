package Domain;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Jameshuang on 10/6/16.
 */
//Test type()
//Test if visitor's type is equal to Student
//Student should be returned
public class StudentTest {
    @Test
    public void Studenttest(){
        Student s  = new Student(2);
        assertEquals(s.type(), "Student");
    }
}

package ie.gmit;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StudentTest {
    @Test
    void testConstrustor()
    {
        Students myStudents = new Students("Mohammad", "g00321094@gmit.ie");
        assertEquals("Mohammad", myStudents.getName());
    }

    @Test
    void testConstrustorNoName()
    {
        Students myStudents = new Students("", "g00321094@gmit.ie");
        assertThrows(IllegalAccessException.class, () ->  new Students("", "g00321094@gmit.ie"));
    }
    @Test
    void testConstrustorNoEmail()
    {
        assertThrows(IllegalAccessException.class, () ->  new Students("Dave", ""));
    }


}

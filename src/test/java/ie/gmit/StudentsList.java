package ie.gmit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentsList {
    Students myStudent;
    StudentsList myList;

    @BeforeEach
    void setup()
    {
        myStudent = new Students("Mohammad", "g00321094@gmit.ie");
        myList = new StudentsList();
    }

    @Test
    void testAddStudent() {
        myList.addStudent(myStudent);
        assertEquals(1, myList.getSize());
    }

    @Test
    void testFindByNameStudent() {
        myList.addStudent(myStudent);
        assertEquals(myStudent, myList.findByName("Mohammad"));
    }
}

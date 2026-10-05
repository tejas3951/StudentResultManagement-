import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class StudentResultTest {

    @Test
    void testCalculateAverage() {
        StudentResult student = new StudentResult("Rahul", 80, 90, 70);

        double average = student.calculateAverage();

        assertEquals(80.0, average);
    }

    @Test
    void testCalculateGrade() {
        StudentResult student = new StudentResult("Priya", 95, 90, 92);

        String grade = student.calculateGrade();

        assertEquals("A", grade);
    }

    @Test
    void testStudentPassed() {
        StudentResult student = new StudentResult("Arun", 60, 70, 80);

        boolean result = student.isPassed();

        assertTrue(result);
    }

    @Test
    void testStudentFailed() {
        StudentResult student = new StudentResult("Kiran", 35, 70, 80);

        boolean result = student.isPassed();

        assertFalse(result);
    }
}
package de.phl.programmingproject.enrollmentsystem;

import de.phl.programmingproject.TestBase;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

/**
 * Tests for the 'Student Enrollment System' exercise in {@link Main}.
 */
public class StudentEnrollmentSystemTest extends TestBase {

    private static final String STUDENT_NAME = "John Doe";
    private static final String COURSE_INTRODUCTION_TO_COMPUTER_SCIENCE_NAME = "Introduction to Computer Science";
    private static final String COURSE_OBJECT_ORIENTED_PROGRAMMING_NAME = "Object-Oriented Programming";


    @BeforeEach
    void setup() {
        this.redirectSystemOut();
    }

    @AfterEach
    void tearDown() {
        this.resetSystemOut();
    }


    @Test
    void task_3_correct_information_for_student_john_printed() {
        Main.main(null);
        String output = getSystemOut();
        assertTrue(output.toLowerCase().contains(String.format("Name: %s, ID: %s,", STUDENT_NAME, "12345").toLowerCase()),
                "The information for student 'John Doe' is missing or not printed correctly. The output was:\n" + output);
    }

    @Test
    void task_3_correct_information_for_course_introduction_to_cs_printed() {
        Main.main(null);
        String output = getSystemOut();
        assertTrue(output.toLowerCase().contains(String.format("Name: %s", COURSE_INTRODUCTION_TO_COMPUTER_SCIENCE_NAME).toLowerCase()),
                String.format("The information for course '%s' is missing or not printed correctly. The output was:\n%s", COURSE_INTRODUCTION_TO_COMPUTER_SCIENCE_NAME, output));
    }

    @Test
    void task_6_student_is_enrolled_in_introduction_to_computer_science() {
        Main.main(null);
        String output = getSystemOut();
        assertTrue(output.toLowerCase().contains(String.format("Student: %s, Course: %s", STUDENT_NAME, COURSE_INTRODUCTION_TO_COMPUTER_SCIENCE_NAME).toLowerCase()),
                String.format("The information for the enrollment of student '%s' for course '%s' is missing or not printed correctly. The output was:\n%s",
                        STUDENT_NAME, COURSE_INTRODUCTION_TO_COMPUTER_SCIENCE_NAME, output));
    }

    @Test
    void task_8_grade_of_introduction_to_computer_science_is_set_to_4() {
        Main.main(null);
        String output = getSystemOut();
        assertTrue(output.toLowerCase().contains(String.format("Student: %s, Course: %s, Grade: %s", STUDENT_NAME, COURSE_INTRODUCTION_TO_COMPUTER_SCIENCE_NAME, "4.0").toLowerCase()),
                String.format("The grade of the student '%s' for course '%s' is missing. The output was:\n%s",
                        STUDENT_NAME, COURSE_INTRODUCTION_TO_COMPUTER_SCIENCE_NAME, output));
    }

    @Test
    void task_11_student_is_enrolled_in_oop() {
        Main.main(null);
        String output = getSystemOut();
        String expected = String.format("Name: %s, Students: [%s]", COURSE_OBJECT_ORIENTED_PROGRAMMING_NAME, STUDENT_NAME);
        assertTrue(output.toLowerCase().contains(expected.toLowerCase()),
                String.format("The information for the enrollment of student '%s' for course '%s' is missing. The output was:\n%s",
                        STUDENT_NAME, COURSE_OBJECT_ORIENTED_PROGRAMMING_NAME, output));
    }

    @Test
    void task_12_print_list_of_students_for_introduction_to_cs() {
        Main.main(null);
        String output = getSystemOut();
        resetSystemOut();
        Pattern pattern = Pattern.compile(String.format("\\[Name\\: %s, ID\\: %s, Courses\\: \\[.*%s.*\\]\\]", STUDENT_NAME, "12345", COURSE_INTRODUCTION_TO_COMPUTER_SCIENCE_NAME));

        for (String line : output.split("\n")) {
            if (pattern.matcher(line).find()) {
                return;
            }
        }
        fail(String.format("The list of students for the course '%s' is missing. The output was:\n%s",
                COURSE_INTRODUCTION_TO_COMPUTER_SCIENCE_NAME, output));
    }

    @Test
    void task_14_john_doe_not_enrolled_in_introduction_to_cs() {
        Main.main(null);
        String output = getSystemOut();
        for (String line : output.split("\n")) {
            if (line.equals("[]")) {
                return;
            }
        }
        fail(String.format("Student %s is still enrolled in course %s! The output was:\n%s", STUDENT_NAME,
                COURSE_INTRODUCTION_TO_COMPUTER_SCIENCE_NAME, output));
    }
}

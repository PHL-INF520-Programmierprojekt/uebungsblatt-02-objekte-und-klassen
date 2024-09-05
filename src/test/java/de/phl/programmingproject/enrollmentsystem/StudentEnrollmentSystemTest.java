package de.phl.programmingproject.enrollmentsystem;

import de.phl.programmingproject.TestBase;
import de.phl.programmingproject.TestUtils;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
        TestUtils.assertSystemOutMatchesRegex(() -> Main.main(null),
                String.format("Name: %s, ID: %s,", STUDENT_NAME, "12345"),
                String.format("The information for student '%s' is missing or not printed correctly.", STUDENT_NAME));
    }

    @Test
    void task_3_correct_information_for_course_introduction_to_cs_printed() {
        TestUtils.assertSystemOutMatchesRegex(() -> Main.main(null),
                String.format("Name: %s", COURSE_INTRODUCTION_TO_COMPUTER_SCIENCE_NAME),
                String.format("The information for course '%s' is missing or not printed correctly.", COURSE_INTRODUCTION_TO_COMPUTER_SCIENCE_NAME));}

    @Test
    void task_6_student_is_enrolled_in_introduction_to_computer_science() {
        TestUtils.assertSystemOutMatchesRegex(() -> Main.main(null),
                String.format("Student: %s, Course: %s", STUDENT_NAME, COURSE_INTRODUCTION_TO_COMPUTER_SCIENCE_NAME),
                String.format("The information for the enrollment of student '%s' for course '%s' is missing or not printed correctly.",
                        STUDENT_NAME, COURSE_INTRODUCTION_TO_COMPUTER_SCIENCE_NAME));
    }

    @Test
    void task_8_grade_of_introduction_to_computer_science_is_set_to_4() {
        TestUtils.assertSystemOutMatchesRegex(() -> Main.main(null),
                String.format("Student: %s, Course: %s, Grade: %s", STUDENT_NAME, COURSE_INTRODUCTION_TO_COMPUTER_SCIENCE_NAME, "4.0"),
                String.format("The grade of the student '%s' for course '%s' is missing.", STUDENT_NAME, COURSE_INTRODUCTION_TO_COMPUTER_SCIENCE_NAME));
    }

    @Test
    void task_11_student_is_enrolled_in_oop() {
        TestUtils.assertSystemOutMatchesRegex(() -> Main.main(null),
                String.format("Name: %s, Students: \\[%s\\]", COURSE_OBJECT_ORIENTED_PROGRAMMING_NAME, STUDENT_NAME),
                String.format("The information for the enrollment of student '%s' for course '%s' is missing.", STUDENT_NAME, COURSE_OBJECT_ORIENTED_PROGRAMMING_NAME));
    }

    @Test
    void task_12_print_list_of_students_for_introduction_to_cs() {
        TestUtils.assertSystemOutMatchesRegex(() -> Main.main(null),
                String.format("\\[Name\\: %s, ID\\: %s, Courses\\: \\[.*%s.*\\]\\]", STUDENT_NAME, "12345", COURSE_INTRODUCTION_TO_COMPUTER_SCIENCE_NAME),
                String.format("The list of students for the course '%s' is missing.", COURSE_INTRODUCTION_TO_COMPUTER_SCIENCE_NAME));
    }

    @Test
    void task_14_john_doe_not_enrolled_in_introduction_to_cs() {
        TestUtils.assertSystemOutMatchesRegex(() -> Main.main(null),
                ".*\\[\\].*",
                String.format("Student %s is still enrolled in course %s!", STUDENT_NAME, COURSE_INTRODUCTION_TO_COMPUTER_SCIENCE_NAME));
    }
}

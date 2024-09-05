package de.phl.programmingproject.petadoption;

import de.phl.programmingproject.TestBase;
import de.phl.programmingproject.TestUtils;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Tess for the 'Pet Adoption Center' exercise.
 */
public class PetAdoptionCenterTest extends TestBase {

    @BeforeEach
    void setup(){
        this.redirectSystemOut();
    }

    @AfterEach
    void tearDown(){
        this.resetSystemOut();
    }

    @Test
    void task_3_correct_information_for_pet_buddy_printed() {
        TestUtils.assertSystemOutMatchesRegex(() -> Main.main(null),
                String.format("Name: %s, Age: %d, Breed: %s", "Buddy", 3, "Labrador Retriever"),
                "The information for pet 'Buddy' is missing or not printed correctly.");
    }

    @Test
    void task_4_correct_information_for_adopter_jane_printed() {
      TestUtils.assertSystemOutMatchesRegex(() -> Main.main(null),
              String.format("Name: %s, Phone: %s, Email: %s", "Jane Smith", "555-555-5555", "janesmith@email.com"),
              "The information for adopter 'Jane Smith' is missing or not printed correctly");
    }

    @Test
    void task_7_correct_information_for_adoption_printed() {
        TestUtils.assertSystemOutMatchesRegex(() -> Main.main(null),
                "Pet:.*Adopter:.*Jane.*Date",
                "It seems that 'Buddy' was not yet adopted by 'Jane Smith'");
    }


    @Test
    void task_8_buddy_was_adopted(){
        String output = TestUtils.runActionAndGetSystemOut(() -> Main.main(null));
        assertTrue(output.contains("true"),
                "It seems that 'Buddy' was not yet adopted, as 'getAdopted()' did not yet return 'true''. The output was:\n" + output);
    }
}

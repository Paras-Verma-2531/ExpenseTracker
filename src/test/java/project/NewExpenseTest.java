package project;
import org.SuryaKN.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class NewExpenseTest {

    @Test
    public void testNewExpenseCreation() {
        // Test if the NewExpense object can be created without throwing any exceptions
        try {
            new NewExpense();
        } catch (Exception e) {
            fail("Unexpected exception thrown: " + e);
        }
    }

    // Add more test methods here to test different functionalities of NewExpense if needed
}

package project;

import org.SuryaKN.ExpenseDB;
import org.SuryaKN.HomeWindow;
import org.junit.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.sql.SQLException;

public class ExpenseDBTest {

    @Test
    public void testGetALL() {
        try {
            // Mock static method call
            mockStatic(HomeWindow.class);
            when(HomeWindow.getSort()).thenReturn("All");

            assertNotNull(ExpenseDB.getALL());
        } catch (SQLException e) {
            fail("SQLException occurred: " + e.getMessage());
        }
    }

    @Test
    public void testGetColumns() {
        try {
            // Mock static method call
            mockStatic(HomeWindow.class);
            when(HomeWindow.getSort()).thenReturn("All");

            assertNotNull(ExpenseDB.getColumns());
        } catch (SQLException e) {
            fail("SQLException occurred: " + e.getMessage());
        }
    }

    @Test
    public void testGetCategories() {
        // No need for mocking in this test
        assertNotNull(ExpenseDB.getCategories());
    }

    @Test
    public void testInsertExpenses() {
        // No need for mocking in this test
        // You may need to replace the arguments with appropriate values for your test
        ExpenseDB.insertExpenses("Test Expense", "Test Description", 100, "Test Category", "2024-04-20");
        // Assert if the insertion was successful, you can add more assertions based on your requirements
        // For example, check if the inserted data exists in the database
    }

    @Test
    public void testTotalExpenses() {
        // Mock static method call
		mockStatic(HomeWindow.class);
		when(HomeWindow.getSort()).thenReturn("All");

		assertNotNull(ExpenseDB.totalExpenses());
    }

    @Test
    public void testTotalMonthlyExpenses() {
        // Mock static method call
		mockStatic(HomeWindow.class);
		when(HomeWindow.getSort()).thenReturn("All");

		assertNotNull(ExpenseDB.totalMonthlyExpenses());
    }

    @Test
    public void testTotalExpensesFromDateToDate() {
        // Mock static method call
		mockStatic(HomeWindow.class);
		when(HomeWindow.getSort()).thenReturn("All");

		// You may need to replace the arguments with appropriate values for your test
		assertNotNull(ExpenseDB.totalExpenses("2024-01-01", "2024-04-20"));
    }

    @Test
    public void testTotalExpensesWithSort() {
        // Mock static method call
		mockStatic(HomeWindow.class);

		// You may need to replace the argument with appropriate value for your test
		assertNotNull(ExpenseDB.totalExpenses("Housing"));
    }
}

package project;
import org.SuryaKN.ExpenseDB;
import org.junit.*;
import static org.junit.Assert.*;

import java.sql.SQLException;
public class ExpenseDBTest {
	 @Test
	    public void testGetALL() {
	        try {
	            assertNotNull(ExpenseDB.getALL());
	        } catch (SQLException e) {
	            fail("SQLException occurred: " + e.getMessage());
	        }
	    }

	    @Test
	    public void testGetColumns() {
	        try {
	            assertNotNull(ExpenseDB.getColumns());
	        } catch (SQLException e) {
	            fail("SQLException occurred: " + e.getMessage());
	        }
	    }

	    @Test
	    public void testGetCategories() {
	        assertNotNull(ExpenseDB.getCategories());
	    }

	    @Test
	    public void testInsertExpenses() {
	        // You may need to replace the arguments with appropriate values for your test
	        ExpenseDB.insertExpenses("Test Expense", "Test Description", 100, "Test Category", "2024-04-20");
	        // Assert if the insertion was successful, you can add more assertions based on your requirements
	        // For example, check if the inserted data exists in the database
	    }

	    @Test
	    public void testTotalExpenses() {
	        assertNotNull(ExpenseDB.totalExpenses());
	    }

	    @Test
	    public void testTotalMonthlyExpenses() {
	        assertNotNull(ExpenseDB.totalMonthlyExpenses());
	    }

	    @Test
	    public void testTotalExpensesFromDateToDate() {
	        // You may need to replace the arguments with appropriate values for your test
	        assertNotNull(ExpenseDB.totalExpenses("2024-01-01", "2024-04-20"));
	    }

	    @Test
	    public void testTotalExpensesWithSort() {
	        // You may need to replace the argument with appropriate value for your test
	        assertNotNull(ExpenseDB.totalExpenses("Housing"));
	    }
}

package project;

import org.SuryaKN.ExpenseDB;
import org.SuryaKN.HomeWindow;
import org.junit.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.sql.SQLException;

public class ExpenseDBTest {

    @Before
    public void setUp() {
        // Mock static method call for HomeWindow.getSort()
        mockStatic(HomeWindow.class);
    }

    @Test
    public void testGetALL() throws SQLException {
        when(HomeWindow.getSort()).thenReturn("All");
        assertNotNull(ExpenseDB.getALL());
    }

    @Test
    public void testGetColumns() throws SQLException {
        when(HomeWindow.getSort()).thenReturn("All");
        assertNotNull(ExpenseDB.getColumns());
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
    public void testTotalExpenses() throws SQLException {
        when(HomeWindow.getSort()).thenReturn("All");
        assertNotNull(ExpenseDB.totalExpenses());
    }

    @Test
    public void testTotalMonthlyExpenses() throws SQLException {
        when(HomeWindow.getSort()).thenReturn("All");
        assertNotNull(ExpenseDB.totalMonthlyExpenses());
    }

    @Test
    public void testTotalExpensesFromDateToDate() throws SQLException {
        // You may need to replace the arguments with appropriate values for your test
        assertNotNull(ExpenseDB.totalExpenses("2024-01-01", "2024-04-20"));
    }

    @Test
    public void testTotalExpensesWithSort() {
        // You may need to replace the argument with appropriate value for your test
        String result = ExpenseDB.totalExpenses("Housing");

        // Modify the assertion to expect a specific result when there are no expenses for the category
        assertEquals("No expenses found for category: Housing", result);
    }
}

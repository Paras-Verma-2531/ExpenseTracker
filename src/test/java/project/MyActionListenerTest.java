package project;
import org.SuryaKN.*;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.sql.SQLException;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class MyActionListenerTest {

    @Mock
    JButton mockButton;

    @Mock
    JComboBox mockComboBox;

    @Test
    public void testActionPerformedForButtonNew() {
        MyActionListener listener = new MyActionListener();
        when(mockButton.getActionCommand()).thenReturn("+NEW");

        ActionEvent mockEvent = mock(ActionEvent.class);
        when(mockEvent.getSource()).thenReturn(mockButton);

        try {
            listener.actionPerformed(mockEvent);
        } catch (Exception e) {
            fail("Unexpected exception thrown: " + e.getMessage());
        }
    }

    @Test
    public void testActionPerformedForButtonSummary() throws SQLException {
        MyActionListener listener = new MyActionListener();
        when(mockButton.getActionCommand()).thenReturn("Summary");

        ActionEvent mockEvent = mock(ActionEvent.class);
        when(mockEvent.getSource()).thenReturn(mockButton);

        String[] categories = {"Category1", "Category2"};
        Mockito.when(ExpenseDB.getCategories()).thenReturn(categories);
        Mockito.when(ExpenseDB.totalExpenses(anyString())).thenReturn(100.0); // Corrected

        try {
            listener.actionPerformed(mockEvent);
        } catch (Exception e) {
            fail("Unexpected exception thrown: " + e.getMessage());
        }
    }

    @Test
    public void testActionPerformedForComboBox() throws SQLException {
        MyActionListener listener = new MyActionListener();

        ActionEvent mockEvent = mock(ActionEvent.class);
        when(mockEvent.getSource()).thenReturn(mockComboBox);

        try {
            listener.actionPerformed(mockEvent);
        } catch (Exception e) {
            fail("Unexpected exception thrown: " + e.getMessage());
        }
    }
}


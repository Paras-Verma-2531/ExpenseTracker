package project;
import org.SuryaKN.*;
import org.junit.Test;
import javax.swing.JButton;
import javax.swing.JComboBox;

import static org.junit.Assert.*;

import java.awt.event.ActionEvent;
import java.sql.SQLException;

public class MyActionListenerTest {

    @Test
    public void testActionPerformedForButtonNew() {
        MyActionListener listener = new MyActionListener();
        ActionEventMock mockEvent = new ActionEventMock(new JButton("+NEW"));
        try {
            listener.actionPerformed(mockEvent);
        } catch (Exception e) {
            fail("Unexpected exception thrown: " + e.getMessage());
        }
        // Add assertions based on the behavior you expect
    }

    @Test
    public void testActionPerformedForButtonSummary() throws SQLException {
        MyActionListener listener = new MyActionListener();
        ActionEventMock mockEvent = new ActionEventMock(new JButton("Summary"));
        try {
            listener.actionPerformed(mockEvent);
        } catch (Exception e) {
            fail("Unexpected exception thrown: " + e.getMessage());
        }
        // Add assertions based on the behavior you expect
    }

    @Test
    public void testActionPerformedForComboBox() throws SQLException {
        MyActionListener listener = new MyActionListener();
        ActionEventMock mockEvent = new ActionEventMock(new JComboBox<>());
        try {
            listener.actionPerformed(mockEvent);
        } catch (Exception e) {
            fail("Unexpected exception thrown: " + e.getMessage());
        }
        // Add assertions based on the behavior you expect
    }

    // Custom ActionEventMock class to mock ActionEvent
    private static class ActionEventMock extends ActionEvent {
    	private static final long serialVersionUID = 1L;

        public ActionEventMock(Object source) {
            super(source, ActionEvent.ACTION_PERFORMED, null);
        }
    }
}

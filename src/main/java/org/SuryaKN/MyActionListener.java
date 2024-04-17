import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class MyActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        
        if (source instanceof JButton) {
            JButton button = (JButton) source;
            if (button.getActionCommand().equals("+NEW")) {
                new NewExpense();
            }

            if (button.getActionCommand().equals("Summary")) {
                String[] rs = ExpenseDB.getCategories();
                StringBuilder summary = new StringBuilder();
                summary.append("Summary:\n\n");

                for (String s : rs) {
                    summary.append(s).append(" : ").append(ExpenseDB.totalExpenses(s)).append("\n");
                }

                JOptionPane.showMessageDialog(null, summary.toString(), "Expense Summary", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        
        if (source instanceof JComboBox) {
            JComboBox<?> comboBox = (JComboBox<?>) source;
            try {
                HomeWindow.updateTable();
            } catch (SQLException exception) {
                throw new RuntimeException(exception);
            }
            HomeWindow.updateTotal();
        }
    }
}

import javax.swing.JOptionPane;

public class Program36 {
    public static void main(String[] args) {
        // Show a simple information dialog box
        JOptionPane.showMessageDialog(null, "This is an information dialog box.", "Information", JOptionPane.INFORMATION_MESSAGE);

        // Show a warning dialog box with Yes/No options
        int choice = JOptionPane.showConfirmDialog(null, "Do you want to proceed?", "Warning", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

        // Process the user's choice
        if (choice == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "You chose to proceed.", "Result", JOptionPane.PLAIN_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "You chose not to proceed.", "Result", JOptionPane.PLAIN_MESSAGE);
        }

        // Show an input dialog box to get user input
        String userInput = JOptionPane.showInputDialog(null, "Enter your name:", "Input", JOptionPane.QUESTION_MESSAGE);
        if (userInput != null) {
            JOptionPane.showMessageDialog(null, "Hello, " + userInput + "!", "Greetings", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No name entered.", "Message", JOptionPane.WARNING_MESSAGE);
        }
    }
}

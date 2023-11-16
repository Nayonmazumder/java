import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Program19 {
    private JFrame frame;
    private JTextField textField;

    public Program19() {
        frame = new JFrame("NAYON");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create panel for buttons
        JPanel buttonPanel = new JPanel(new GridLayout(6, 6));

        // Create the digit buttons
        for (int i = 0; i <= 9; i++) {
            JButton digitButton = new JButton(String.valueOf(i));
            digitButton.addActionListener(new DigitButtonListener());
            buttonPanel.add(digitButton);
        }

        // Create the operation buttons
        String[] operations = { "+", "-", "*", "%" };
        for (String operation : operations) {
            JButton operationButton = new JButton(operation);
            operationButton.addActionListener(new OperationButtonListener());
            buttonPanel.add(operationButton);
        }

        // Create the equal button
        JButton equalButton = new JButton("=");
        equalButton.addActionListener(new EqualButtonListener());
        buttonPanel.add(equalButton);

        // Create the text field
        textField = new JTextField();
        textField.setEditable(false);

        // Add components to the frame
        frame.add(textField, BorderLayout.NORTH);
        frame.add(buttonPanel, BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);
    }

    private class DigitButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton) e.getSource();
            String digit = button.getText();
            textField.setText(textField.getText() + digit);
        }
    }

    private class OperationButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton) e.getSource();
            String operation = button.getText();
            textField.setText(textField.getText() + " " + operation + " ");
        }
    }

    private class EqualButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String expression = textField.getText();
            String[] parts = expression.split(" ");
            int result = Integer.parseInt(parts[0]);
            for (int i = 1; i < parts.length; i += 2) {
                String operation = parts[i];
                int operand = Integer.parseInt(parts[i + 1]);
                switch (operation) {
                    case "+":
                        result += operand;
                        break;
                    case "-":
                        result -= operand;
                        break;
                    case "*":
                        result *= operand;
                        break;
                    case "%":
                        result %= operand;
                        break;
                }
            }
            textField.setText(String.valueOf(result));
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Program19();
            }
        });
    }
}
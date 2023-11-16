import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class ArithmeticCalculator extends Applet implements ActionListener {
    TextField numField1, numField2, resultField;
    Button addButton, subtractButton, multiplyButton, divideButton;

    public void init() {
        numField1 = new TextField(10);
        numField2 = new TextField(10);
        resultField = new TextField(10);
        resultField.setEditable(false); // Making the result field non-editable

        addButton = new Button("Add");
        subtractButton = new Button("Subtract");
        multiplyButton = new Button("Multiply");
        divideButton = new Button("Divide");

        addButton.addActionListener(this);
        subtractButton.addActionListener(this);
        multiplyButton.addActionListener(this);
        divideButton.addActionListener(this);

        add(new Label("Number 1:"));
        add(numField1);
        add(new Label("Number 2:"));
        add(numField2);
        add(addButton);
        add(subtractButton);
        add(multiplyButton);
        add(divideButton);
        add(new Label("Result:"));
        add(resultField);
    }

    public void actionPerformed(ActionEvent e) {
        int num1 = Integer.parseInt(numField1.getText());
        int num2 = Integer.parseInt(numField2.getText());
        int result = 0;

        if (e.getSource() == addButton) {
            result = num1 + num2;
        } else if (e.getSource() == subtractButton) {
            result = num1 - num2;
        } else if (e.getSource() == multiplyButton) {
            result = num1 * num2;
        } else if (e.getSource() == divideButton) {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                resultField.setText("Cannot divide by zero!");
                return;
            }
        }

        resultField.setText(String.valueOf(result));
    }
}

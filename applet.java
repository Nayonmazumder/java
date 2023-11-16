import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class AddNumbersApplet extends Applet implements ActionListener {
    TextField numField1, numField2;
    Button addButton;
    Label resultLabel;

    public void init() {
        numField1 = new TextField(10);
        numField2 = new TextField(10);
        addButton = new Button("Add");
        resultLabel = new Label("Result: ");

        addButton.addActionListener(this);

        add(new Label("Enter Number 1:"));
        add(numField1);
        add(new Label("Enter Number 2:"));
        add(numField2);
        add(addButton);
        add(resultLabel);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
            try {
                int num1 = Integer.parseInt(numField1.getText());
                int num2 = Integer.parseInt(numField2.getText());
                int sum = num1 + num2;
                resultLabel.setText("Result: " + sum);
            } catch (NumberFormatException ex) {
                resultLabel.setText("Result: Invalid input");
            }
        }
    }
}

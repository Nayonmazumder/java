import java.awt.*;
import java.awt.event.*;

public class GUIComponentsDemo extends Frame implements ItemListener {
    Choice choice;
    Checkbox checkbox1, checkbox2, checkbox3;
    CheckboxGroup radioGroup;
    Checkbox radioBtn1, radioBtn2, radioBtn3;

    public GUIComponentsDemo() {
        setTitle("GUI Components Demo");
        setSize(400, 300);
        setLayout(new FlowLayout());

        // Choice component
        choice = new Choice();
        choice.add("Option 1");
        choice.add("Option 2");
        choice.add("Option 3");
        choice.addItemListener(this);

        // Checkboxes
        checkbox1 = new Checkbox("Checkbox 1");
        checkbox2 = new Checkbox("Checkbox 2");
        checkbox3 = new Checkbox("Checkbox 3");
        checkbox1.addItemListener(this);
        checkbox2.addItemListener(this);
        checkbox3.addItemListener(this);

        // Radio buttons
        radioGroup = new CheckboxGroup();
        radioBtn1 = new Checkbox("Radio 1", radioGroup, false);
        radioBtn2 = new Checkbox("Radio 2", radioGroup, false);
        radioBtn3 = new Checkbox("Radio 3", radioGroup, false);
        radioBtn1.addItemListener(this);
        radioBtn2.addItemListener(this);
        radioBtn3.addItemListener(this);

        add(choice);
        add(checkbox1);
        add(checkbox2);
        add(checkbox3);
        add(radioBtn1);
        add(radioBtn2);
        add(radioBtn3);

        setVisible(true);

        // Closing the frame when window is closed
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void itemStateChanged(ItemEvent e) {
        // Handling events from Choice, CheckBoxes, and RadioButtons
        if (e.getSource() == choice) {
            String selectedOption = choice.getSelectedItem();
            System.out.println("Choice selected: " + selectedOption);
        } else if (e.getSource() instanceof Checkbox) {
            Checkbox checkBox = (Checkbox) e.getSource();
            System.out.println("Checkbox selected: " + checkBox.getLabel() + " - " + checkBox.getState());
        } else if (e.getSource() instanceof Checkbox) {
            Checkbox radioButton = (Checkbox) e.getSource();
            System.out.println("Radio button selected: " + radioButton.getLabel() + " - " + radioButton.getState());
        }
    }

    public static void main(String[] args) {
        new GUIComponentsDemo();
    }
}

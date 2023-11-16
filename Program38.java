import java.awt.*;

public class StudentInfoFrame extends Frame {
    Label nameLabel, ageLabel, gradeLabel;

    public StudentInfoFrame() {
        setTitle("Student Information");
        setSize(300, 200);
        setLayout(new FlowLayout());

        nameLabel = new Label("Name: John Doe");
        ageLabel = new Label("Age: 20");
        gradeLabel = new Label("Grade: A");

        add(nameLabel);
        add(ageLabel);
        add(gradeLabel);

        setVisible(true);

        // Closing the frame when window is closed
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        new StudentInfoFrame();
    }
}

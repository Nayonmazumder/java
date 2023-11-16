import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;

public class FileViewer extends Frame {
    private List fileList;
    private TextArea fileContentArea;

    public FileViewer() {
        setTitle("File Viewer");
        setSize(400, 300);

        fileList = new List();
        fileContentArea = new TextArea();

        // Fill the list with file names (replace these with your file names)
        String[] fileNames = {"file1.txt", "file2.txt", "file3.txt"}; // Replace with your file names
        for (String fileName : fileNames) {
            fileList.add(fileName);
        }

        fileList.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) { // Check for double-click
                    int selectedIndex = fileList.getSelectedIndex();
                    if (selectedIndex != -1) {
                        String selectedFile = fileList.getItem(selectedIndex);
                        displayFileContents(selectedFile);
                    }
                }
            }
        });

        setLayout(new BorderLayout());
        add(fileList, BorderLayout.WEST);
        add(fileContentArea, BorderLayout.CENTER);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    private void displayFileContents(String fileName) {
        fileContentArea.setText(""); // Clear previous content
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                fileContentArea.append(line + "\n");
            }
        } catch (IOException e) {
            fileContentArea.setText("Error reading the file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        new FileViewer();
    }
}

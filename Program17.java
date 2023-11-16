import java.io.File;
import java.io.IOException;

public class Program17 {

    public static void main(String[] args) throws IOException {
        // Get the file name from the user
        System.out.print("Enter the file name: ");
        String fileName = System.console().readLine();

        // Create a File object for the specified file name
        File file = new File(fileName);

        // Check if the file exists
        if (file.exists()) {
            System.out.println("The file exists");
        } else {
            System.out.println("The file does not exist");
            return;
        }

        // Check if the file is readable
        if (file.canRead()) {
            System.out.println("The file is readable");
        } else {
            System.out.println("The file is not readable");
        }

        // Check if the file is writable
        if (file.canWrite()) {
            System.out.println("The file is writable");
        } else {
            System.out.println("The file is not writable");
        }

        // Get the type of the file
        String fileType = file.isDirectory() ? "Directory" : "File";
        System.out.println("The file type is: " + fileType);

        // Get the length of the file in bytes
        long fileLength = file.length();
        System.out.println("The file length is: " + fileLength + " bytes");
    }
}

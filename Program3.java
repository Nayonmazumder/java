public class Program3 {
    public static void main(String[] args) {
        // Check if there are any arguments
        if (args.length == 0) {
            System.out.println("No command-line arguments provided.");
        } else {
            System.out.println("Command-line arguments:");
            // Loop through the arguments and display them
            for (int i = 0; i < args.length; i++) {
                System.out.println(args[i]);
            }
        }
    }
}
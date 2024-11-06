import java.util.Scanner;

public class Helper {
    private static final Scanner scanner = new Scanner(System.in);
    // Method to get String input
    public static String getInput(String prompt) {
        String name=scanner.nextLine();
        System.out.print(prompt+name);
// Code to get input from scanner
        return name; // replace with actual input
    }
    // Method to get integer input
    public static int getIntInput(String prompt) {
        int age = scanner.nextInt();
        System.out.print(prompt+age);
// Code to check for integer input
        return age; // replace with actual integer input
    }
    // Method to close scanner
    public static void closeScanner() {
// Close the scanner if needed
    }

}




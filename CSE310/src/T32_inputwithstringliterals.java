import java.util.Scanner;

public class T32_inputwithstringliterals {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");

        // Create an object with string literals
        String inputString = scanner.nextLine();

        // Display the input string
        System.out.println("Input string: " + inputString);

        // Close the scanner
        scanner.close();
    }
}

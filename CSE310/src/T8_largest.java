import java.util.Scanner;

public class T8_largest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter three integers
        System.out.print("Enter three integers separated by spaces: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        // Find the largest number among a, b, and c
        int d = (a > b) ? a : b;
        int largest = (d > c) ? d : c;

        // Print the largest number
        System.out.println("The largest number is: " + largest);

    }
}

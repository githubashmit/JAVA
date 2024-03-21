public class T4_literals {
    public static void main(String[] args) {
        // Integer literals
        int integerLiteral = 42;
        long longLiteral = 123456789L;

        // Floating-point literals
        float floatLiteral = 3.14f;
        double doubleLiteral = 2.71828;

        // Character literals
        char charLiteral = 'A';

        // String literals
        String stringLiteral = "Hello, Java!";

        // Boolean literals
        boolean trueLiteral = true;
        boolean falseLiteral = false;

        // Null literal
        Object nullLiteral = null;

        int binaryNumber = 0b1010; // Binary representation of 10
        System.out.println("Binary: " + binaryNumber);
        int octalNumber = 012; // Octal representation of 10
        System.out.println("Octal: " + octalNumber);
        int decimalNumber = 10; // Decimal representation of 10
        System.out.println("Decimal: " + decimalNumber);
        int hexNumber = 0xA; // Hexadecimal representation of 10
        System.out.println("Hexadecimal: " + hexNumber);


        // Printing all literals
        System.out.println("Integer Literal: " + integerLiteral);
        System.out.println("Long Literal: " + longLiteral);
        System.out.println("Float Literal: " + floatLiteral);
        System.out.println("Double Literal: " + doubleLiteral);
        System.out.println("Character Literal: " + charLiteral);
        System.out.println("String Literal: " + stringLiteral);
        System.out.println("Boolean True Literal: " + trueLiteral);
        System.out.println("Boolean False Literal: " + falseLiteral);
        System.out.println("Null Literal: " + nullLiteral);
    }
}

public class T31_static {
    private static int x;

    // Static block
    static {
        System.out.println("Inside static block");
        x = 10;
    }

    public static void main(String[] args) {
        System.out.println("Value of x: " + x);
    }
}

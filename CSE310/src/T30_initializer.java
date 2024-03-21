public class T30_initializer {
     int x;

    // Initializer block
    {
        System.out.println("Inside initializer block");
        x = 10;
    }

    // Constructor
    public T30_initializer() {
        System.out.println("Inside constructor");
    }

    public static void main(String[] args) {
        T30_initializer obj = new T30_initializer();
        System.out.println("Value of x: " + obj.x);
    }
}

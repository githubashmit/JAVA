public class T33_String_constructor {
     String string;

    public T33_String_constructor(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return string;
    }

    public static void main(String[] args) {
        T33_String_constructor myString = new T33_String_constructor("Hello, world!");
        System.out.println(myString); // Output: Hello, world!
    }
}

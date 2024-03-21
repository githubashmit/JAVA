class Outer {
    class Inner {
        void msg() {
            System.out.println("Inner class");
        }
    }
}

public class T44_outer {
    public static void main(String[] args) {
        Outer outerObj = new Outer();
        Outer.Inner innerObj = outerObj.new Inner();
        innerObj.msg();
    }
}
public class T17_division {
    int l;
    int b;
    T17_division(){
         l =9;
         b=3;
    }
    double division(){
        double d = l /b;
        return d;
    }
    class Test{
        void performTest(){
        T17_division obj1= new T17_division();
        double result = obj1.division();
            System.out.println("Result of division: " + result);
        }
    }

    public static void main(String[] args) {
        T17_division obj = new T17_division();
        double a = obj.division();
        System.out.println(a);

        Test testObj = obj.new Test();
        testObj.performTest();
    }
}

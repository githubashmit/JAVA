public class T12_bitwise {
    public static void main(String[] args) {
        int a = 12;
        int b= 7;
        boolean an = (a>5) && (b<10);
        System.out.println(an);
        int bitan= a& b;
        System.out.println(bitan);
        int leftshiftresult = a<<2;
        System.out.println(leftshiftresult);
        int rightshiftresult = a>>1;
        System.out.println(rightshiftresult);
    }
}

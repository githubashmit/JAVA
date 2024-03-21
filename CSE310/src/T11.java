public class T11 {
    public int getGreatestNumber(int a , int b , int c) {
        return (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
    }
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        T11 cs = new T11();
        int d = cs.getGreatestNumber(a , b ,c);
        System.out.println(d);
    }
}

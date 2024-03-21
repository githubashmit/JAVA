import java.util.Scanner;

public class T7_positive_negative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();
        if(d<0.0){
            System.out.println("negative");
        }else{
            System.out.println("positive");
        }
    }
}

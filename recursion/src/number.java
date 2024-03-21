import java.sql.SQLOutput;
import java.util.Scanner;

public class number {
    void number1(int a){
        if(a==1){
            System.out.println(a);
        }else{
            number1(a-1);
            System.out.println(a);
        }
    }
    public static void main(String[] args) {
        number n = new number();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int a = sc.nextInt();
        n.number1(a);
    }
}

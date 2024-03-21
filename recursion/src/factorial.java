import java.util.Scanner;

public class factorial {
    int factorial1(int a){
           if(a==1){
               return 1;
           }else{
               return a * factorial1(a-1);
           }
    }
    public static void main(String[] args) {
        factorial f = new factorial();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number ");
        int a = sc.nextInt();
        System.out.println(f.factorial1(a));
    }
}

import java.util.Scanner;

public class T15_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=10;i++){
            int x = n*i;
            if(x%10 == 0){
                continue;
            }
            System.out.println(n+"*"+i+"="+x);
        }
    }
}

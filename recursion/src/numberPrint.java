import java.util.Scanner;

public class numberPrint {
    int numberPrint1(int a){
        if(a==1){
            return 1;
        }else{
            return a + numberPrint1(a-1);
        }
    }
    public static void main(String[] args) {
        numberPrint np = new numberPrint();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(np.numberPrint1(a));
    }
}

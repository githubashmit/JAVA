public class T11_recursion {
    static int factorial(int n){
        // factorial(n)= n * n-1 * .......1
        if(n==0 || n==1){
            return 1;
        }

        return n* factorial(n-1);
    }
    public static void main(String[] args){
        int x = 4;
        System.out.println("The value of factorial x is:"+ factorial(x));
    }
}


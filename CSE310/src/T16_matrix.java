import java.util.Scanner;

public class T16_matrix {
    public static void main(String[] args) {
        int[][] jaggedArray = new int[args.length][];
        for (int i = 0; i < args.length; i++)
            jaggedArray[i] = new int[Integer.parseInt(args[i])];
        for (int[] subArray : jaggedArray) {
            for (int num : subArray)
                System.out.print(num + " ");
            System.out.println();

        }
    }
}

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MiniMax{

    // Complete the miniMaxSum function below.
    static void miniMaxSum(long[] arr) {
        long sum=0,temp;
        int i,j;
        for(i=0;i<arr.length;i++)
        {
            sum=sum+arr[i]; 
        }
        Arrays.sort(arr);
        long a=(long)sum-arr[0];
        long b=(long)sum-arr[4];
        System.out.print(b+" "+a);
         
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        long[] arr = new long[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}


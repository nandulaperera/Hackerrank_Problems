import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class PlusMinus {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int pluscount=0,minuscount=0,zerocount=0;
        double a,b,c;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                ++zerocount;
            }
            if(arr[i]>0)
            {
                ++pluscount;
            }
            if(arr[i]<0)
            {
                ++minuscount;
            }
        }
        a=(double) pluscount/arr.length;
        b=(double) minuscount/arr.length;
        c=(double) zerocount/arr.length;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}


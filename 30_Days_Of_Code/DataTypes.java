import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DataTypes {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        int j=scan.nextInt();
        double k=scan.nextDouble();
        scan.nextLine();
        String l=scan.nextLine();
        System.out.println(i+j);
        System.out.println(d+k);
        System.out.println(s+l);
        scan.close();
    }
}

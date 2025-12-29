import java.io.*;
import java.util.*;
import java.text.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        DecimalFormat df=new DecimalFormat("#.0");
        int init=4;
        int i=sc.nextInt();
        float d=sc.nextFloat();
        sc.nextLine();
           String s=sc.nextLine();
 
    System.out.println((int)(i+init));
    System.out.println(df.format(d+init));
    StringBuilder sb=new StringBuilder("HackerRank ").append(s);
    System.out.println(sb.toString());
    }
}

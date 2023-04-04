import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        String s=sc.next();
        switch(s)
        {
            case "+":
                System.out.println(n+m);
                break;
            case "-":
                System.out.println(n-m);
                break;
            case "*":
                System.out.println(n*m);
                break;
            case "/":
                System.out.println(n/m);
                break;
            default:
                System.out.println("invalid operator");
        }
    }
}

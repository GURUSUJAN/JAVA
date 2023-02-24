import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution
{
    public static boolean isBigger(int a,int b)
    {
         if(a>b)
         {
             return true;
         }
         else
         {
             return false;
         }
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        boolean c= isBigger(a,b);
        System.out.println(c);
    }
}

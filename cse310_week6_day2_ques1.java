import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        if(x>0)
        {
            int []ar=new int[x];
            for(int i=0;i<x;i++)
            {
                ar[i]=sc.nextInt();
            }
            int n=sc.nextInt();
            switch(n)
            {
                case 1:
                    Integer o=new Integer();
                    o.add(ar);
                    break;
                case 2:
                    Integer o1=new Integer();
                    o1.mul(ar);
                    break;
                default:
                    System.out.println("Wrong Choice");
                    System.exit(0);
            }
        }
        else
        {
            System.out.println("Invalid Array Size");
                System.exit(0);
        }
    }
}
class Integer
    {
        
       static void add(int ar[])
        {
            int n=ar.length;
            int sum=0;
            for(int i=0;i<n;i++)
            {
                sum+=ar[i];
            }
            System.out.println(sum);
        }
        static void mul(int ar[])
        {
            int n=ar.length;
            int sum=1;
            for(int i=0;i<n;i++)
            {
                sum*=ar[i];
            }
            System.out.println(sum);
        }
    }

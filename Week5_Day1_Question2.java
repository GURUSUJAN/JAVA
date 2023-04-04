import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class circle
{
    Scanner sc=new Scanner(System.in);
    double radius;
    int n=sc.nextInt();
	double []d=new double[n];
    public void getarea()
    {
        if(n>0)
    {
       
        for(int i=0;i<n;i++)
        {
            d[i]=sc.nextDouble();
        }
        for(int i=0;i<n;i++)
        {
            if(d[i]>0.0)
            {
                d[i]=d[i]*d[i]*3.14;
            if(d[i]>30.0)
            {
                System.out.printf("%.4f",d[i]);
            }
            }
            System.out.println();
        }
    }
        if(n<0)
        {
            System.out.println("Invalid input");
        }
    }
}
public class Solution {

    public static void main(String[] args) {
        circle c=new circle();
        c.getarea();
    }
}

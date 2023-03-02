import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int []ar=new int[x];
        for(int i=0;i<x;i++)
        {
            ar[i]=sc.nextInt();
        }
        int y=sc.nextInt();
        int []arr=new int[y];
        for(int i=0;i<y;i++)
        {
            arr[i]=sc.nextInt();
        }
        int z=sc.nextInt();
        int []aar=new int[z];
        for(int i=0;i<z;i++)
        {
            aar[i]=sc.nextInt();
        }
        int a=Math.max(x,y);
        int b=Math.max(a,z);
        int []aa=new int [b];
        //int c=0;
        for(int i=0;i<x;i++)
        {
            for(int j=0;j<y;j++)
            {
                for(int k=0;k<z;k++)
                {
                    if(ar[i]==arr[j] && ar[i]==aar[k])
                    {
                        aa[i]=ar[i];
                    }
                }
            }
        }
        Arrays.sort(aa); 
        for(int i=0;i<b;i++)
        {
            if(aa[i]!=0)
            {
                System.out.print(aa[i]+" ");
            }
        }
    }
}

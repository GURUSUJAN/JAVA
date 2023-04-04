import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        int []ar=new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
            if(ar[i]>1)
            {
                if(ar[i]>25)
                {
                    count++;
                }
            }
            else
                System.exit(0);
        }
        System.out.println(count);
    }
}

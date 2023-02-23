import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0,c=0;
        String [] s=new String[n];
        for(int i=0;i<n;i++)
        {
            s[i]=sc.next();
        }
        for (int i = 0; i < n; i++) 
        {
            if (s[i].matches("\\d+"))
            { 
                c++;
            } else {
                count++;
            }
        }
        System.out.println(c);
        System.out.println(count);
    }
}

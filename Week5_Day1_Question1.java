import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Complex
{
    int []ar=new int[6];
    Scanner sc=new Scanner(System.in);
    public void complex()
    {
        for(int i=0;i<4;i++)
    {
        ar[i]=sc.nextInt();
    }
        ar[4]=ar[0]*ar[3];
        ar[5]=ar[0]*ar[2];
        ar[0]=ar[1]*ar[2];
        ar[2]=ar[1]*ar[3];
        System.out.println((ar[5]-ar[2])+"+"+(ar[4]+ar[0])+"i");
    }
}
public class Solution {

    public static void main(String[] args) {
        Complex c=new Complex();
        c.complex();
    }
}

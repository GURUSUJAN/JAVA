import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>20 && n<400)
        {
            if(n%2==0 && n%3==0)
            {
                System.out.println("True");
            }
            else
            {
                System.out.println("False");
            }
        }
        else
        {
            System.out.println("Invalid Input");
        }
    }
}

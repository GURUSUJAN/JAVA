import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] marks=new int[n];
        int t=0;
        if(n>7){
            System.out.println("Invalid");
        }
        else{
        for(int i=0;i<n;i++){
            marks[i]=sc.nextInt();
            t +=marks[i];
        }
        float p=t/(float)n;
        if(p>=90.0){
            System.out.println("A+");
        }
        else if(p>=70.0&&p<=89.0){
            System.out.println("A");
        }
        else if(p>=60.0&&p<=69.0){
            System.out.println("B");
        }
        else if(p>=50.0&&p<=59.0){
            System.out.println("C");
        }
        else if(p<40.0){
            System.out.println("D");
        }
    }
    }
}

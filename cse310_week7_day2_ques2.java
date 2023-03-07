import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2==0 && n%13==0)
            System.out.println("True");
        else
            System.out.print("False");
    }
}

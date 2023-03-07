import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.toLowerCase();
        s=s.trim();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=' ')
                System.out.print(s.charAt(i));
            else
                System.out.print('$');
        }
    }
}

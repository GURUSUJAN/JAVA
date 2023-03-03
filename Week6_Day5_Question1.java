import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

  class Student{
      String name; int reg;
      
      void show(String name,int reg){
          this.name=name; this.reg=reg;
          System.out.println(name+","+reg);
      }
  }
  

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner obj=new Scanner(System.in);
        int choice=obj.nextInt(); Student a=new Student();
        if(choice==1){
            obj.nextLine();
            String name=obj.nextLine(); 
            int reg=obj.nextInt();
            while(reg<=0){
                 reg=obj.nextInt();
            }
                a.show(name,reg);
        }
        else if(choice==2){
            a.show("null",0);
        }
        else{
            System.out.println("Wrong Choice");
        }
    }
}

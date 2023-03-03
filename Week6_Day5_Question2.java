import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Employee{
     int id; int age;
     Employee(int id,int age){
         this.id=id;
         this.age=age;
     }
     public int getid(){
         return id;
     }
     public int getage(){
         return age;
     }
 }

public class Solution {


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt(); Employee[] a=new Employee[n];
        if(n<1||n>10){
            System.out.println("Invalid input");
            return;
        }
        for(int i=0;i<n;i++){
            int id=obj.nextInt();
            int age=obj.nextInt();
            
            if(id<10||id>1000||age<18||age>50){
                System.out.println("Invalid data");
                return;
            }
            
            a[i]=new Employee(id,age);
        }
        
        int minage=Integer.MAX_VALUE;
        
        for(Employee emp:a){
            if(emp.getage()<minage){
                    minage=emp.getage();
                }
        }
        for(Employee emp:a){
            if(emp.getage()<30&&emp.getage()==minage){
                System.out.println(emp.getid()+ " " +emp.getage());
            }
        }
    }
}

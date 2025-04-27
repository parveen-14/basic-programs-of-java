package JavaPracticeProgram;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String []args){
        int st;
        int en;
        int tn;
        System.out.println("Enter starting Number");
        Scanner sc = new Scanner(System.in);
         st=sc.nextInt();
        System.out.println("Enter ending Number");
        en=sc.nextInt();
        System.out.println("Enter tables  Number");
        tn=sc.nextInt();
        while(st<=en){
            System.out.println(st+" * " + tn + " = "+(st*tn));
            st++;
        }
    }
}

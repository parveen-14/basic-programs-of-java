package JavaPracticeProgram;
import java.util.Scanner;

public class FactorialN0 {
    public static void main(String []args){
       // int num;
        int fact=0;
        System.out.println("Enter Number:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=0;i<=num;i++){
            fact=num*i;
        }
        System.out.println(fact);
    }
}

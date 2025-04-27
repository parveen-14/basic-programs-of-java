package JavaPracticeProgram;
import java.util.Scanner;

public class NaturalNumber {
    public static void main(String []args){
        int st;
        int en;
        System.out.println("Enter starting Number");
        Scanner sc = new Scanner(System.in);
        st=sc.nextInt();
        System.out.println("Enter ending  Number");
        en=sc.nextInt();
        while(st<=en){
            System.out.println(st);
            st++;
        }
    }
}

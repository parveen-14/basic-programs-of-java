package JavaPracticeProgram;

import java.util.Scanner;

public class LeapOrNot {
    public static void main(String []args){
      int year;
        System.out.println("Enter Year: ");
        Scanner sc=new Scanner(System.in);
        year= sc.nextInt();
        if(year % 4== 0 ||( year % 100 ==0 && year % 400 == 0)) {
            System.out.println("year " + year + " is leap year");
        }
        else{
            System.out.println("Year " + year + " is not leap year");
        }

    }
}

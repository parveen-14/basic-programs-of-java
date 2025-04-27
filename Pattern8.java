package JavaPracticeProgram;

import javax.swing.*;

public class Pattern8 {
    public static void main(String[] args) {
        int n = 5;
        int x = n / 2 + 1;
        for (int i = 1; i<= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == x || i + j == x + 1 || i - j == x - 1)

                {
                    System.out.print(" *");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}


class RightPattern{
    public static void main(String[] args) {
        int n = 7;

        int a = 3;
        int b = 9;

        for (int i = 0; i< n; i++) {
            for (int j = 0; j < n; j++) {
                if(j - i == a || i + j == b || i == a)
                {
                    System.out.print(" *");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

package JavaPracticeProgram;

public class Pattern5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {  //i==j times
            for (int j = 4; j >= i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

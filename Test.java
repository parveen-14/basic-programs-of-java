package JavaPracticeProgram;

public class Test {
    static int a;
    static  void m1(int a){
        Test.a=a;
        System.out.println(a);
    }

    public static void main(String[] args) {
       // Test obj=new Test();
        System.out.println(a);
        m1(50);
        System.out.println(a);
    }
}
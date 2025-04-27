package JavaPracticeProgram;

import java.util.Scanner;

public class SwappingTwoNumbers {


        /*
        int a=10;
        int b=20;
        System.out.println("Before Swapping");
        System.out.println("a =" +a);
        System.out.println("a =" +b);

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping");
        System.out.println("a ="+a);
        System.out.println("b ="+b);
        */

        /*
        swapping two numbers using temp
        int a;
        int b;
        int temp=0;
        System.out.println("Enter Value for a");
        Scanner sc=new Scanner(System.in);
         a= sc.nextInt();
        System.out.println("Enter Value for b");
         b= sc.nextInt();

        System.out.println("before swapping a =" +a);
        System.out.println("before swapping b =" +b);

         /*
        temp=a;      //First of all we have to store the value in temp
        a=b;
        b=temp;

        System.out.println("After Swapping a ="+a );
        System.out.println("After Swapping b ="+b );
       */
        /*
  odd even
        for(int i=1 ;i<=10 ;i++){
            System.out.println(i);
            i=i+1;
                 //if we are adding i=1+1; then will get odd number
                 //if we are adding i=2 i=i+1; then will get even number
 */
        /* display text five times
        int i;
        for(i=1;i<=5;i++){
            System.out.println("Hi");

         */
          /* factorial
           int fact=1;
        System.out.println("Enter Number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            fact=num*i;
        }
        System.out.println("Factorial of = "+fact );
        */
//        int i=0;
//        int j=0;
       /* for(int i=0;i<=5;i++){
            for(int j=0;j<=4;j++){
                System.out.println("*");
            }
        }
        */
       /* int remainder=0;
        int rev=0;
        System.out.println("Enter Number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num>0) {
            remainder = num % 10;
            rev = rev * 10 + remainder;
            num /= 10;
        }
        System.out.println(rev);
        */
       // Palindrome or not
        //class PalindromeExample{
 //public static void main(String args[]){
        /*
  int r,sum=0,temp;
  int n=454;//It is the number variable to be checked for palindrome

  temp=n;
  while(n>0){
   r=n%10;  //getting remainder
   sum=(sum*10)+r;
   n=n/10;
  }
  if(temp==sum)
   System.out.println("palindrome number ");
  else
   System.out.println("not palindrome");
         */

//
             String FirstName;
             String Lastname;

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public static void main(String[] args) {
        SwappingTwoNumbers obj=new SwappingTwoNumbers();
        obj.setFirstName("Parveen");
        obj.setLastname("Mulla");
        obj.setFirstName("Parveen Mulla");
        System.out.println("Hashcode of object= "+obj.getFirstName() + " " + "LastName= "+obj.getLastname());
        obj.setLastname("Mulla LastName");
        System.out.println("Hashcode of object= "+obj.getFirstName() + " " + "Updated LastName= "+obj.getLastname());
}
}


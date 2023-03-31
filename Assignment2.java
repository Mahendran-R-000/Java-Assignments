import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] argS){
    int n1, n2, result;
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter first number: ");
    n1=scan.nextInt();
    System.out.print("Enter second number: ");
    n2=scan.nextInt();
    result=sum(n1,n2);
    System.out.println("The sum of two numbers is: " +result);}
    public static int sum(int a, int b)
    {
        int sum = a + b;
        return sum;
    }
}

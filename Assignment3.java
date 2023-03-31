import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=scan.nextInt();
        System.out.println("Sum of numbers is "+Sum(n));
    }
    public static int Sum(int n)
    {
        return n != 0 ? n + Sum(n - 1) : 0;
    }
}

import java.util.Scanner;
public class Assignment1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number:");
        int num = scan.nextInt();
        if (num > 0)
            System.out.println("The number is positive.");
        else if (num < 0)

            System.out.println("The number is negative.");
        else
            System.out.println("The number is zero.");

    }}

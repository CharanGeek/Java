// importing Scanner class
import java.util.Scanner;

public class reverse_number {
    public static void main(String[] args) {
        // initialising variables
        int a,rev=0;

        // taking input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to reverse: ");
        a = sc.nextInt();

        // using Mathematical way to reverse the number
        rev = rev*10+a%10;
        a=a/10;

        rev = rev*10+a%10;
        a=a/10;

        rev = rev*10+a%10;
        a=a/10;

        rev = rev*10+a%10;
        a=a/10;

        sc.close(); //reclaiming Scanner memory

        System.out.println("Reverse of your number is: "+rev);
    }
}

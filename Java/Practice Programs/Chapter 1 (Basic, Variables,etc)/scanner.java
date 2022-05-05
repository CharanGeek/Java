import java.util.Scanner;

public class scanner{
    public static void main(String[] args) {
        System.out.println("Taking input from the user!");
        
        Scanner mySc = new Scanner(System.in);

        System.out.println("Enter 1st number");
        float num1 = mySc.nextFloat();

        System.out.println("Enter 2nd number");
        float num2 = mySc.nextFloat();
        mySc.close();

        float sum = num1 + num2;

        System.out.println("Sum of the 2 numbers you entered is: "+sum);
    }
}
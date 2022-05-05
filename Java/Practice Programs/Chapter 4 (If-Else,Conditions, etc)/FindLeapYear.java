import java.util.Scanner;

public class FindLeapYear {
    public static void main(String[] args) {
        System.out.print("Enter a year and this program will tell weather it's a leap year or not: ");
        Scanner sc = new Scanner(System.in);
        int userChoice = sc.nextInt();
        sc.close();

        if(userChoice%100 == 0)
        {
            if(userChoice%400 == 0)
            {
                System.out.println(userChoice+" is a leap year");
            }

            else
            {
                System.out.println(userChoice+" is NOT a leap year");
            }
        }

        else
        {
            if(userChoice%4 == 0)
            {
                System.out.println(userChoice+" is a leap year!");
            }

            else
            {
                System.out.println(userChoice+" is NOT a leap year!");
            }
        }
    }
}

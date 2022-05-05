import java.util.Scanner;

public class FindDayWithNum {
    public static void main(String[] args) {
        System.out.print("Enter a number from 1-7 to get a corresponding day: ");
        Scanner sc = new Scanner(System.in);
        int userChoice = sc.nextInt();
        sc.close();

        switch(userChoice){
            case 1 -> System.out.println("Monday");

            case 2 -> System.out.println("Tuesday");

            case 3 -> System.out.println("Wednesday");

            case 4 -> System.out.println("Thusday");

            case 5 -> System.out.println("Friday");

            case 6 ->  System.out.println("Saturday");

            case 7 -> System.out.println("Sunday");

            default -> System.out.println("Invalid choice");
        }
    }
}

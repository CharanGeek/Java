import java.util.Scanner;
public class testLeap {

    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter a 4 digit year(yyyy): ");
        int year = inp.nextInt();
        inp.close();

        checkLeap(year);
    }

    public static void checkLeap(int year){
        if(year%100==0){
            if(year%400==0){
                System.out.println("This year is a leap year");
            }

            else{
                System.out.println("This year isn't a leap year");
            }
        }
        else{
            if(year%4==0){
                System.out.println("This year is a leap year");
            }

            else{
                System.out.println("This year isn't a leap year");
            }
        }
    }
}

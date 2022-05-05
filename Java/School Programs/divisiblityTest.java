import java.util.Scanner;

public class divisiblityTest
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        boolean divby2 = false,divby4 = false, divby5 = false;
        int number,lastDigit,last2Digits;

        System.out.println("Enter an integer: ");
        number = sc.nextInt();
        sc.close();

        lastDigit = number%10;
        last2Digits = number%100;
        
        if(lastDigit == 0 || lastDigit == 2 || lastDigit == 4 || lastDigit == 6 || lastDigit == 8 ){
            divby2 = true;
        }

        if(lastDigit == 0 || lastDigit == 5){
            divby5 = true;
        }

        if(last2Digits % 4 == 0){
            divby4 = true;
        }
        
        if (divby2 == true || divby5 == true || divby4 == true){
            System.out.println(number + " is divisible by all 2,4 and 5");
        }
        else{
            System.out.println(number + " isn't divisible by all 2,4 and 5");
        }
    }
}
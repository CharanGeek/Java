import java.util.Scanner;

public class RevOfGivenNum {
    public static void main(String[] args) {
        int revNum = 0;
       Scanner key = new Scanner(System.in);
       System.out.print("Enter a number to be reversed: "); 
       int number = key.nextInt();
        key.close();

       while(number>0){
           int quo = number/10;
           int rem = number%10;
           revNum = revNum*10 + rem;
           number = quo;
       }

       System.out.println("Reverse of your number is "+revNum);
    }
}

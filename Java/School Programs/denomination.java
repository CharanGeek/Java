// importing Scanner class
import java.util.Scanner;

public class denomination {
    public static void main(String[] args) {

        // initializing the variables
        int amt,r1000=0,r500=0,r100=0,r50=0,r20=0,r10=0,r5=0,r2=0,r1=0;

        // taking input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount: ");
        amt= sc.nextInt();

        int bal=amt;

        // calculating the denominations
        r1000=bal/1000;
        bal=bal%1000;
        r500=bal/500;
        bal=bal%500;
        r100=bal/100;
        bal=bal%100;
        r50=bal/50;
        bal=bal%50;
        r20=bal/20;
        bal=bal%20;
        r10=bal/10;
        bal=bal%10;
        r5=bal/5;
        bal=bal%5;
        r2=bal/2;
        bal=bal%2;
        r1=bal/1;
        
        sc.close(); // reclaiming Scanner memory

        System.out.println("Total amount is: "+amt);
        System.out.println("Rs.1000 notes: "+r1000);
        System.out.println("Rs.500 notes: "+r500);
        System.out.println("Rs.100 notes: "+r100);
        System.out.println("Rs.50 notes: "+r50);
        System.out.println("Rs.20 notes: "+r20);
        System.out.println("Rs.10 notes: "+r10);
        System.out.println("Rs.5 notes: "+r5);
        System.out.println("Rs.2 notes: "+r2);
        System.out.println("Rs.1 notes: "+r1);

    }
}

import java.util.Scanner;

public class ComputeTax{

    public static void main(String args[]){
        double tax = 0,income;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Annual Gross Income: ");
        income = sc.nextDouble();
        sc.close();

        if(income <= 250000){
            tax = 0;
        }

        else if(income > 250000 && income <=500000){
            tax = 10000 + (income-250000)*0.1;
        }

        else if(income > 500000 && income <=1000000){
            tax = 25000 + (income-500000)*0.1;
        }

        else if(income > 1000000){
            tax = 50000 + (income-1000000)*0.1;
        }

        else{
            System.out.println("An error occured");
        }

        System.out.println("Your annual gross income (AGI) is: "+income+" and tax charged on this income is- "+tax);

    }

}
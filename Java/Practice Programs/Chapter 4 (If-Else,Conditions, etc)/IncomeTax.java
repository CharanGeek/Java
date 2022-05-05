import java.util.Scanner;

public class IncomeTax {
    public static void main(String[] args) {
        float income,tax = 0;
        System.out.print("Enter your income: ");
        Scanner sca = new Scanner(System.in);
        income = sca.nextFloat();

        sca.close();

        if(income<=250000)
        {
            tax = 0;
        }

        else if(income>250000 && income<=500000)
        {
            tax += 5.0f/100*(income-250000);
        }

        else if(income>500000 && income<=1000000)
        {
            tax += (5.0f/100*250000) + (20.0f/100*(income-500000));
        }

        else if(income>1000000)
        {
            tax += (5.0f/100*250000) + (20.0f/100*(500000)) + (30.0f/100*(income - 1000000));
        }

        System.out.println("Your total tax is Rs."+tax);
    }
}

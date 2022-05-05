import java.util.Scanner;

public class SalesCommission {
    public static void main(String[] args) {
        double sales, commission = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount of sales (in rupees): ");
        sales = sc.nextDouble();
        sc.close();

        if(sales >100000){
            commission = sales*0.25;
        }

        else if (sales>=80000 && sales <=100000){
            commission = sales *0.225;
        }

        else if (sales>=60000 && sales <80000){
            commission = sales *0.20;
        }

        else if (sales>=40000 && sales <60000){
            commission = sales *0.15;
        }

        else if (sales <40000){
            commission = sales *0.125;
        }

        else{
            System.out.println("Error");
        }

        System.out.println("Commission on sales of "+sales+" rupees is- "+commission);

        
    }
}

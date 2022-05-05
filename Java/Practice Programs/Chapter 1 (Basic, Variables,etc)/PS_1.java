import java.util.Scanner;

public class PS_1 {
    public static void main(String[] args) {
        float n1,n2,n3,total;
        System.out.println("Enter 3 numbers (or decimals) to get their sum!");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st number: ");
        n1 = sc.nextFloat();

        System.out.println("Enter 2nd number: ");
        n2 = sc.nextFloat();

        System.out.println("Enter 3rd number: ");
        n3 = sc.nextFloat();

        sc.close();

        total = n1+n2+n3;
        System.out.println("Sum of "+n1+", "+n2+" and "+n3+" is: "+total);
        
    }
}

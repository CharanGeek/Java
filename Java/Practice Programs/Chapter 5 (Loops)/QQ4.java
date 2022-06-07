import java.util.Scanner;

public class QQ4
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of natural numbers you want to print in reverse order: ");
        int n = scan.nextInt();
        
        for(int i=n; i!=0; i--)
            System.out.println(i);
    }
}

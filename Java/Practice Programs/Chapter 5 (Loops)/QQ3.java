import java.util.Scanner;

public class QQ3
{
    public static void main(String main[])
    {
        // Print n number for odd numbers
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of odd numbers you want to print: ");
        int n = sc.nextInt();
        
        for(int i = 0; i < n; i++)
        {
            System.out.println(2*i+1);
        }
    }
}

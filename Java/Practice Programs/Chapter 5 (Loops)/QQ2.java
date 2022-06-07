import java.util.Scanner;

public class QQ2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many natural numbers do you want to print: ");
        int n = sc.nextInt();
        int i = 1;
        do{
            System.out.println(i);
            i++;
        }while(i<=n);
    }
}

import java.util.Scanner;

public class PracticeSet
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[])
    {
        /*
        -------------------------------------------------------------------------------------------------
        Question 1) Print this pattern
        * * * *
        * * * 
        * * 
        * 
        
        Answer:
        
        int n = 4;
        for(int i = n; i > 0; i--)
        {
            for(int j = 1; j <= i; j++)
                System.out.print("* ");
            System.out.println("");
        }
        
        -------------------------------------------------------------------------------------------------
        
        Question 2) Sum of first n even numbers
        Answer:
        
        System.out.print("Enter the number of even number whose sum you want to print: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 0; i<=n; i++)
        {
            sum += 2 * i;
        }
        System.out.println("Sum of first "+n+" natural numbers is: "+sum);
        
        -------------------------------------------------------------------------------------------------
        
        Question 3) Print the multiplication table of a given number
        Answer:
        
        System.out.print("Enter the number whose table you want to print: ");
        int n = sc.nextInt();
        
        for(int i = 1; i<=10; i++)
        {
            System.out.println(n+" x "+i+" = "+(n*i));
        }
        
        -------------------------------------------------------------------------------------------------
        
        Question 4) Print table of 10 reverse
        Answer:
        
        for(int i = 10; i>0; i--)
        {
            System.out.println("10 x "+i+" = "+(10*i));
        }
        
        -------------------------------------------------------------------------------------------------
        
        Question 5) Print factorial
        Answer:
               
        System.out.print("Enter the number whose factorial you want to print: ");
        int n = sc.nextInt();
        int facto = 1;
        for(int i = 1; i<=n; i++)
        {
            facto *= i;
        }
        
        System.out.println("Factorial of "+n+" is: "+facto);
        
        -------------------------------------------------------------------------------------------------
        
        Question 6) Repeat Ques. 5 using while loop
        Answer:
        
        System.out.print("Enter the number whose factorial you want to print: ");
        int n = sc.nextInt();
        
        int i = 1, facto = 1;
        while(i<=n)
        {
            facto*=i;
            i++;
        }
        System.out.println("Factorial of "+n+" is: "+facto);
        
        -------------------------------------------------------------------------------------------------
        
        Question 7) Repeat Ques. 1 using while loop
        Answer:
        
        int n = 4,j = 1;
        while(n!=0)
        {
            while(j<=n)
            {
                System.out.print("* ");
                j++;
            }
            j = 1;
            n--;
            System.out.println("");
        }
        
        -------------------------------------------------------------------------------------------------
        
        Question 8) Write a program to calculate sum of all numbers occuring the multiplication table of 8
        Answer:
        
        int i = 1, sum = 0;
        while(i <= 10)
        {
            sum += i * 8;
            i++;
        }
        
        System.out.println("Sum of all numbers occuring the multiplication table of 8 is "+sum);
        
        -------------------------------------------------------------------------------------------------
        
        Question 9) Repeat question 2 using do-while loop
        Answer:
        
        System.out.print("Enter the number of even number whose sum you want to print: ");
        int n = sc.nextInt();
        int sum = 0, i = 0;
        
        do
        {
            sum += 2 * i;
            i++;
        }while(i<=n);
        
        System.out.println("Sum of first "+n+" natural numbers is: "+sum);
        
        */
    }
}

import java.util.Scanner;
public class SumOfOddAndEvenTill_N {
    public static void main(String[] args) {
        int sum_even = 0 ,sum_odd=0;
        Scanner sca = new Scanner(System.in);
        System.out.print("Enter the number till which you want to print sum of ODD and EVEN: ");
        int n = sca.nextInt();
        sca.close();
        
        int i = 1;

        while(i<=n)
        {
            if(i%2 == 0){
                sum_even += i;
            }

            else{
                sum_odd += i;
            }

            i++;
        }

        System.out.println("Sum of even integers upto "+n+" is: "+sum_even);
        System.out.println("Sum of odd integers upto "+n+" is: "+sum_odd);

    }


}

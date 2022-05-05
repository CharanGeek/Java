public class PrintSumOfDigitOfNumber {
    public static void main(String[] args) {
        int s = printSum(34223);
        System.out.println("Sum of all digits of 34223 is: "+ s);

        int k = printSum(9381);
        System.out.println("Sum of all digits of 9381 is: "+ k);

        int m = printSum(73482734);
        System.out.println("Sum of all digits of 73482734 is: "+ m);
    }

    public static int printSum(int num){
        int sum = 0;
        while(num>0){
            int quo = num/10;
            int rem = num%10;
            sum += rem;
            num = quo;
        }

        return sum;
    }
}

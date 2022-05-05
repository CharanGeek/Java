import java.util.Scanner;

public class Project13To20 {
    public static void main(String[] args) {
        String Line = "----------------------------------------------------";
        Scanner sc = new Scanner(System.in);

        String EnterNum = "Enter Number to be checked :- ";
        System.out.println(Line);
        System.out.println("1) Spy Number");
        System.out.println("2) Niven Number");
        System.out.println("3) Duck Number");
        System.out.println("4) Armstrong Number");
        System.out.println("5) Twin Prime Numbers");
        System.out.println("6) Prime Number");
        System.out.println("7) Smallest Digit");
        System.out.println(Line);
        System.out.print("Enter Your choice :- ");
        int user_choice = sc.nextInt();
        System.out.println(Line);

        switch (user_choice) {
            case 1:
                System.out.print(EnterNum);
                int user_num1 = sc.nextInt();
                SpyNumber(user_num1);
                break;

            case 2:
                System.out.print(EnterNum);
                int user_num2 = sc.nextInt();
                NivenNumber(user_num2);
                break;

            case 3:
                System.out.print(EnterNum);
                int user_num3 = sc.nextInt();
                DuckNumber(user_num3);
                break;

            case 4:
                System.out.println(EnterNum);
                int user_num4 = sc.nextInt();
                findArmstrong(user_num4);
                break;

            case 5:
                System.out.println(EnterNum);
                int user_num5 = sc.nextInt();
                int user_num6 = sc.nextInt();
                findTwinPrime(user_num5, user_num6);
                break;

            case 6:
                System.out.println(EnterNum);
                int user_num7 = sc.nextInt();
                findPrime(user_num7);
                break;

            case 7:
                System.out.println(EnterNum);
                int user_num8 = sc.nextInt();
                findSmallest(user_num8);
                break;

            default:
                break;
        }
        sc.close();
    }

    public static void SpyNumber(int num) {
        int sum = 0, product = 1, digit, n1 = num;

        while (num > 0) {
            digit = num % 10;
            sum += digit;
            product *= digit;
            num /= 10;

        }
        if (sum == product) {
            System.out.println(n1 + " is a spy number");
        }

        else {
            System.out.println(n1 + " is not a spy number");
        }
    }

    public static void NivenNumber(int num) {
        int sum = 0, digit, n1 = num;
        while (num > 0) {
            digit = num % 10;
            sum += digit;
            num /= 10;
        }

        if (n1 % sum == 0) {
            System.out.println(n1 + " is a Niven number");
        }

        else {
            System.out.println(n1 + " is not a Niven number");
        }
    }

    public static void DuckNumber(int num) {
        int digit, n1 = num;
        boolean isDuck = false;
        while (num > 0) {
            digit = num % 10;
            if (digit == 0) {
                isDuck = true;
                break;
            }

            num /= 10;
        }

        if (isDuck == true) {
            System.out.println(n1 + " is a duck number");
        }

        else {
            System.out.println(n1 + " is not a duck number");
        }
    }

    public static void findArmstrong(int num) {
        int digit, n1 = num, sum = 0;

        while (num != 0) {
            digit = num % 10;
            sum += Math.pow(digit, 3);
            num /= 10;
        }

        if (sum == n1) {
            System.out.println(n1 + " is an Armstrong number");
        }

        else {
            System.out.println(n1 + " is not an Armstrong number");
        }
    }

    public static void findTwinPrime(int n1, int n2) {
        int n1Count = 0,n2Count = 0;

        for (int i = 1; i <= n1; i++) {
            if(n1%i == 0){
                n1Count++;
            }
        }

        for(int k = 1;k <= n2;k++){
            if(n2%k == 0){
                n2Count++;
            }
        }

        int differenceBetweenNum = Math.abs(n1-n2);

        if(n1Count == 2 && n2Count == 2 && differenceBetweenNum == 2){
            System.out.println(n1+" and "+n2+" are Twin Prime");
        }

        else{
            System.out.println(n1+" and "+n2+" are not Twin Prime");
        }
    }

    public static void findPrime(int num) {
        int count=0;
        for(int i = 1;i<=num;i++){
            if (num%i==0) {
                count++;
            }
        }

        if(count==2){
            System.out.println(num+" is a prime number");
        }

        else{
            System.out.println(num+" is not a prime number");
        }
    }

    public static void findSmallest(int num) {
        int digit,smallNum = 10,n1=num;
        
        while(num!=0){
            digit = num%10;
            num/=10;

            if(digit<smallNum){
                smallNum=digit;
            }
        }

        System.out.println("The smallest number in "+n1+" is "+smallNum);
    }

    public static void checkNum(int num)
    {
        int temp1 = num;
        System.out.println("Enter you number --->");
        Scanner sca = new Scanner(System.in);

        float userNum = sca.nextFloat();

        System.out.println(userNum);
        
    }
}

import java.util.*;
// import java.util.concurrent.TimeUnit;
// import java.util.concurrent.Executors;
// import java.util.concurrent.ScheduledExecutorService;
// import java.util.concurrent.TimeUnit;
class Initial 
{
    static String Line = "----------------------------------------------------";
    public static void main(String[] args) throws InterruptedException{
        Scanner sc = new Scanner(System.in);
        String EnterNum = "Enter Number to be checked :- ";
        System.out.println(Line);
        System.out.println("1)Prime Numbers");
        System.out.println("2)Spy Number");
        System.out.println("3)Niven Number");
        System.out.println("4)Duck Number");
        System.out.println("5)Armstrong Number");
        System.out.println("6)Print Smallest Digit");
        System.out.println("For Exiting Please Enter E/e");
        System.out.println(Line);
        System.out.print("Enter Your choice :- ");  
        int choice = sc.nextInt();
        System.out.println(Line);
        switch(choice)
        {
            case 1:
            System.out.print(EnterNum);
            int Number = sc.nextInt();
            Prime_Numbers(Number);
            break;
            //
            case 2:
            System.out.print(EnterNum);
            int Number1 = sc.nextInt();
            Spy_Numbers(Number1);
            break;
            case 3:
            //
            System.out.print(EnterNum);
            int Number2 = sc.nextInt();
            Niven_Number(Number2);
            break;
            //
            case 4:
            System.out.print(EnterNum);
            int Number3 = sc.nextInt();
            Duck_Number(Number3);
            break;
            //
            case 5:
            System.out.print(EnterNum);
            int Number4 = sc.nextInt();
            Armstrong_Numbere(Number4);
            break;
            case 6:
            System.out.print(EnterNum);
            int Number5 = sc.nextInt();
            Print_Smallest_Digit(Number5);
            break;
            case 7:
            HW();
            break;
            case 69:
            case 101:
            System.out.println("Exiting");
            System.exit(0);
            break;
            //DEFAULT
            default:
            System.out.println("You Enter the Wrong choice");
            System.out.println("The Program is going to Run again please enter the right choice in order to run the program");
            System.out.println(Line);
            Thread.sleep(5000);
            main(args);
        }
        sc.close();
    }
    static void Prime_Numbers(int Number)
    {
        int Count = 0;
        for(int i = 1;i<=Number;i++)    
        {
            if(Number%i==0)
            Count++;
        }
        if (Count==2) {
            System.out.println(Number+" is a Prime Number");
        }
        else
        System.out.println(Number+" is not a Prime Number");
    }
    static void Spy_Numbers(int Number)
    {
        int sum = 0,digit,product = 1, n1 = Number;
        while(Number>0||Number!=0)
        {
            digit = Number%10;
            sum += digit;
            product *= digit;
            Number/=10;
        }
        if (sum==product) {
            System.out.println(n1+" is a spy Number");
        }
        else{
            System.out.println(n1+" is not a Spy Number");
        }
    }
    static void Niven_Number(int Number)
    {
        int digit,sum =0,n1=Number;
        while(Number>0||Number!=0)
        {
            digit = Number%10;
            sum += digit;
            Number/=10;
        }
        if(n1%sum==0)
        {
            System.out.println(n1+" is a Niven Number");
        }
        else
        {
            System.out.println(n1+" is not a Niven Number");
        }
    }
    static void Duck_Number(int Number)
    {
        int digit, n1 = Number;
        while(Number>0||Number!=0)
        {
            digit = Number%10;
            if(digit==0)
            {
                System.out.println(n1+" is a Duck Number");
                break;
            }
            Number/=10;
        }
    }
    static void Armstrong_Numbere(int Number)
    {
        int digit, sum = 0, n1 = Number;
        while(Number>0||Number!=0)
        {
            digit = Number%10;
            sum += Math.pow(digit,3);
            Number /= 10;
        }
        if(sum==n1)
        {
            System.out.println(n1+" is a Armstrong Number");
        }
        else
        {
            System.out.println(n1+" is not an Armstrong Number");
        }
    }
    static void Print_Smallest_Digit(int Number)
    {
        int temp=Number;int ten=10;
        while(Number>0)
        {
            int Digit=Number%10;
            Number=Number/10;
            if(Digit<ten)
            ten=Digit;
        }
    System.out.println("Smallest digit in " +temp+" = "+ten);
    }
    static void Composite_Number()
    {
        
    }
    static void HW()
    {
        int Number = 1,add = 2;
        for (int i = 1; i<=10;i++)
        {
            System.out.print(Number+" ");
            Number +=add;
            add++;
        }
    }
}
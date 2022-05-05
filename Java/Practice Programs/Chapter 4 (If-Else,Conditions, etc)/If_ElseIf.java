import java.util.Scanner;

public class If_ElseIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age ==> ");
        short age = sc.nextShort();
        
        if (age>=80) {
            System.out.println("Your age is more than 80");
        } 
        
        else if(age>=70){
            System.out.println("Your age is more than 70");
        }

        else if(age>=60){
            System.out.println("Your age is more than 60");
        }

        else if(age>=50){
            System.out.println("Your age is more than 50");
        }

        else if(age>=40){
            System.out.println("Your age is more than 40");
        }

        else if(age>=30){
            System.out.println("Your age is more than 30");
        }

        else if(age>=20){
            System.out.println("Your age is more than 20");
        }

        else if(age>=10){
            System.out.println("Your age is more than 10");
        }

        else {
            System.out.println("Your age is more than 0");
        }

        sc.close();
    }
}

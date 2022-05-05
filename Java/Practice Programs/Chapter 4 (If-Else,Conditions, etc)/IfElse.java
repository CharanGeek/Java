import java.util.Scanner;

public class IfElse{
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Please enter your age ==> ");        
        byte age = key.nextByte();
        key.close();

        boolean isEighteenPlus = (age<18);

        if(isEighteenPlus){
            System.out.println("Sorry, you cannot drive");
        }

        else{
            System.out.println("Yes, you can drive!");
        }
    }
}
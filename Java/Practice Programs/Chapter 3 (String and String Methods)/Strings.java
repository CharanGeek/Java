import java.util.Scanner;

public class Strings {
    public static void main(String[] args){
        // Java provides special support for string to use it as a primitive data type

        // A new way to create String
        String name = new String("Aditya");


        System.out.print("sed ");
        System.out.println("random text "+name);

        // Using system.out.printf
        int a = 33;
        float k = 7843.2565f;
        System.out.printf("*dies the value of a is %d and the value of k is %f: ",a,k);

        // In this code, the part "k is %4.2f" means that the output of the variable will take total 4 spaces and print till 2 decimal points
        //System.out.printf("Ok vmro listen the value of a is %d and the value of k is %4.2f: ",a,k);

        // Using system.out.format
        System.out.format("the value of a is %d and the value of k is %f: ",a,k);

        // Taking input from user as String
        Scanner key = new Scanner(System.in);
        String usrStr = key.next(); // if you use .next() then your only the 1st word will be saved in the variable
        key.close();

        System.out.println(usrStr);
    }
}

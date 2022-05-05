import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter your age ==> ");
        short age = inp.nextShort();

        switch (age) {
            case 10:
                System.out.println("You are going to become an teen");
                break;
        
            case 18:
                System.out.println("You are going to become an adult");
                break;
        
            case 21:
                System.out.println("You are going to get a job");
                break;
        
            case 25:
                System.out.println("You are going to get in a relationship");
                break;
        
            case 30:
                System.out.println("You are going to have a mid-life crisis");
                break;
        
            case 35:
                System.out.println("You die cuz you die");
                break;
        
            default:
                System.out.println("Idk man! Go fucking enjoy!");
                break;
        }
        System.out.println("I'm out of switch case");
        inp.close();

        /*
        WARNING ==> This is allowed only from Java 14 and onwards

        switch (age) {
            case 10 -> System.out.println("You are going to become an teen");
            case 18 -> System.out.println("You are going to become an adult");
            case 21 -> System.out.println("You are going to get a job");
            case 25 -> System.out.println("You are going to get in a relationship");
            case 30 -> System.out.println("You are going to have a mid-life crisis");
            case 35 -> {
                System.out.println("You die cuz you die");
                System.out.println("HAHAHHAHAHA");
                }
            default -> System.out.println("Idk man! Go fucking enjoy!");
        } 
        */
    }
}

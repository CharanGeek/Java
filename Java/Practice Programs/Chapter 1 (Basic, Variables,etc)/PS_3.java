import java.util.Scanner;

public class PS_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hey! What's your name?");
        String name = sc.nextLine();
        sc.close();
        System.out.println("Hello, "+name+" have a good day!");
    }
}

import java.util.Scanner;

public class PS_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer. If you enter literally anything, then I'll come to know it!");
        System.out.println(sc.hasNextInt());
        sc.close();
    }
}

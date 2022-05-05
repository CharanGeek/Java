import java.util.Scanner;

public class PP3 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.print("Give a number, we'll check weather if it's greater than 100 or not: ");
        int inp = sca.nextInt();
        sca.close();

        System.out.println(inp>100);
    }
}

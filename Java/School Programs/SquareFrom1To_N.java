import java.util.Scanner;

public class SquareFrom1To_N {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.print("Enter the number till which you want to print square: ");
        int n = sca.nextInt();
        sca.close();
        int i = 1;
        while(i<=n){
            System.out.println((int) Math.pow(i,2));
            i++;
        }
    }
}

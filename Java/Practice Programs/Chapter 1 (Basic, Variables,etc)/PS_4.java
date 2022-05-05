import java.util.Scanner;

public class PS_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a distance to KM to convert it into MILES!");
        float km = sc.nextFloat();
        sc.close();

        float milesInKM = 0.609F;
        float miles = km * milesInKM;

        System.out.println(km+" in miles is: "+miles);
    }
}

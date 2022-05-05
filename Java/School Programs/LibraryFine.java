import java.util.Scanner;

public class LibraryFine {
    public static void main(String[] args) {
        int days;
        double fine = 0;

        Scanner sca = new Scanner(System.in);
        System.out.print("Enter the late return date: ");
        days = sca.nextInt();
        sca.close();

        if(days <= 5){
            fine = 0.40*days;
        }

        else if(days >= 6 && days < 10){
            fine = 5*0.40 + (days - 5)*0.65;
        }

        else if (days > 10){
            fine = 5 * 0.40 + 5 * 0.65 + (days -10) * 0.80;
        }

        System.out.println("You were late for: "+days+" and you have been fined- "+fine+" rupees");
    }
}

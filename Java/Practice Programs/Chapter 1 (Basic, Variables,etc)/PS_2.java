import java.util.Scanner;

public class PS_2 {
    public static void main(String[] args) {
        float s1,s2,s3,avg,CGPA;

        System.out.println("Hello!\nThis is a program to calculate the CGPA of a student in 3 subjects (out of 100).");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks in 1st subject: ");
        s1 = sc.nextInt();

        System.out.println("Enter marks in 2nd subject: ");
        s2 = sc.nextInt();

        System.out.println("Enter marks in 3rd subject: ");
        s3 = sc.nextInt();

        sc.close();

        avg = (s1+s2+s3)/3F;
        CGPA = avg/10F;

        System.out.println("Your CGPA is: "+CGPA);
        
    }
}

import java.util.Scanner;

public class CBSE_Marks {
    public static void main(String[] args) {
        float eng,hin,math,sci,sst,total,outOf;

        System.out.println("Hello!\nThis is a program to calculate the percentage of a student in 5 subjects.");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the maximum marks in a subject: ");
        outOf = sc.nextFloat();

        System.out.print("English: ");
        eng = sc.nextFloat();

        System.out.print("Hindi: ");
        hin = sc.nextFloat();

        System.out.print("Maths: ");
        math = sc.nextFloat();

        System.out.print("Science: ");
        sci = sc.nextFloat();

        System.out.print("Social Studies: ");
        sst = sc.nextFloat();

        sc.close();

        total = eng+hin+math+sci+sst;
        float percent = (total*100)/(outOf*5);

        System.out.println("Your percentage in examination is: "+percent);
        
    }
}

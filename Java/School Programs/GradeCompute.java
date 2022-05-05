import java.util.Scanner;

public class GradeCompute {
    public static void main(String[] args) {
        double percent;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter percentage: ");
        percent = sc.nextDouble();
        sc.close();
        
        if(percent <= 100 && percent >=75){
            System.out.println("Passed with star");
        }

        else if(percent < 75 && percent >=60){
            System.out.println("First division");
        }

        else if(percent < 60 && percent >=40){
            System.out.println("Second division");
        }

        else if(percent < 40){
            System.out.println("Failed");
        }
        
        else{
            System.out.println("Error");
        }

        
    }
}

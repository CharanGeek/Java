import java.util.Scanner;

public class TaxtFare {
    public static void main(String[] args) {
        double fare=0,distance;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the distance (in km): ");
        distance = sc.nextDouble();
        sc.close();
        
        if(distance <=10){
            fare = distance*20;
        }

        else if(distance >10 && distance <=30){
            fare = 10 * 20 + (distance -10)*15;
        }

        else if(distance >30 && distance <=70){
            fare = 10 * 20 + 20 * 15 + (distance -30)*10;
        }

        else if(distance >70 && distance <=140){
            fare = 10 * 20 + 20 * 15 + 40 * 10 + (distance -70)*8;
        }

        else{
            System.out.println("error");
        }

        System.out.println("Total distance travelled by you is: "+distance+" and your total fare is- "+fare);
    }
}

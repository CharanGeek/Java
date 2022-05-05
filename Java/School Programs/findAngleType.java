import java.util.Scanner;

public class findAngleType {
    public static boolean possibleAngle(int a1,int a2,int a3){
        boolean result;
        if(a1+a2+a3==180){
            result = true;
        }

        else{
            result = false;
        }

        return result;
    }
    public static void main(String[] args) {
        int a1,a2,a3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter all 3 angles");
        a1 = sc.nextInt();
        a2 = sc.nextInt();
        a3 = sc.nextInt();
        
        if(possibleAngle(a1, a2, a3)==true){
            findAngle(a1,a2,a3);
        }

        else{
            System.out.println("Given 3 angles cannot form a triangle");
        }
        sc.close();
    }

    public static void findAngle(int a1,int a2,int a3){
        if(a1 > 90 || a2 > 90 || a3 > 90){
            System.out.println("Given 3 sides make an Obtuse Angled Triangle");
        }

        else if(a1 == 90 || a2 == 90 || a3 == 90){
            System.out.println("Given 3 side make a right angled triangle");
        }

        else if(a1 < 90 && a2 < 90 && a3 < 90){
            System.out.println("Given 3 sides make an acute angled triangle");
        }

        else{
            System.out.println("Error");
        }
    }
}

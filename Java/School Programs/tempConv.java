import java.util.Scanner;

public class tempConv{

    public static void main(String[] args) {
        // Declaring variables
        float usr_choice,tempF,tempC;
        Scanner usr_inp = new Scanner(System.in);
        System.out.println("Enter 1 for C to F conversion\nEnter 2 for F to C conversion");
        usr_choice = usr_inp.nextInt();

        if(usr_choice == 1F){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter temperature in Celcius: ");
            tempC = sc.nextFloat();
            mainTempConv(1F,1F,tempC);
            sc.close();
        }

        else if(usr_choice == 2F){
            Scanner sca = new Scanner(System.in);
            System.out.println("Enter temperature in Fahrenheit: ");
            tempF = sca.nextFloat();
            mainTempConv(2F,tempF,1F);
            sca.close();
        }

        usr_inp.close();
    }

    public static void mainTempConv(float choice,float tempF,float tempC){
        if(choice == 1F){
            tempF = (tempC * 1.8F)+32;
            System.out.println("Temperature in Fahrenheit is: "+tempF);
        }

        else if(choice == 2F){
            tempC = (tempF-32)/1.8F;
            System.out.println("Temperature in Celcius is: "+tempC);
        }

        else{
            System.out.println("Error");
        }
    }
}
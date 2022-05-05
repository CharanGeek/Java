import java.util.Scanner;

public class RockPaperScissors{

    public static void inpAndGenerate(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Let's start with your name!");
        String usr_name = sc.nextLine();
        System.out.println(usr_name+" here are your choices:\n\t1 for Rock\n\t2 for Scissors\n\t3 for Paper");
        System.out.print("Enter your choice: ");
        int usr_choice = sc.nextInt();

        int range = 3-1+1;
        int comp_choice = (int) (Math.random()*range+1);

        System.out.println("Your choice is "+usr_choice+" and Computer chose: "+comp_choice);
        findWinner(usr_choice, comp_choice,usr_name);
        sc.close();
    }

    public static void findWinner(int usr_choice,int comp_choice,String human){
        if(usr_choice == 1 && comp_choice == 3 || usr_choice == 2 && comp_choice == 1 || usr_choice == 3 && comp_choice == 2){
            System.out.println("Rock! Paper! Scissor!");
            System.out.println(human+ " you've won the game!");
        }

        else if(comp_choice == 1 && usr_choice == 3 || comp_choice == 2 && usr_choice == 1 || usr_choice == 3 && comp_choice == 2){
            System.out.println("Rock! Paper! Scissor!");
            System.out.println("Computer wins!");
        }

        else{
            System.out.println("It's a tie!");

        }
    }
    
    public static void main(String[] args){
        System.out.println("Hello and this is Rock, Paper and Scissors game");
        inpAndGenerate();
    }
}
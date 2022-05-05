import java.util.Scanner;

public class PP2 {
    public static void main(String[] args) {
        // char grade = 'C';
        Scanner key = new Scanner(System.in);
        System.out.print("Enter your grade which you want to encrypt (type in captial letter between A-Z: ");
        char grade = key.next().charAt(0);
        key.close();

        char encryptedGrade = (char) (grade + 8);
        char decryptedGrade = (char) (encryptedGrade - 8);
        System.out.println("The original grade is "+grade+"\nThe encrypted grade is: "+encryptedGrade+" and the decrypted grade is: "+decryptedGrade);
    }
}

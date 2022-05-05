import java.util.Scanner;

public class PassFail {

  public static void main(String[] args) {
    //   Question 2
    byte m1, m2, m3;
    System.out.println("This program will take marks for 3 subjects (out of 100) and find weather you are pass or fail!");
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter marks for 1st Subject ---> ");
    m1 = sc.nextByte();

    System.out.print("Enter marks for 2nd Subject ---> ");
    m2 = sc.nextByte();

    System.out.print("Enter marks for 3rd Subject ---> ");
    m3 = sc.nextByte();

    sc.close();

    checkPassOrFail(m1, m2, m3);
  }

  static void checkPassOrFail(float m1, float m2, float m3) {
    float total = m1 + m2 + m3;
    float totalPercent = total / 300 * 100;

    if (m1 < 33 || m2 < 33 || m3 < 33) 
    {
      System.out.println("You are failed in atleast one subject since you got less than 33 marks. You percentage is "+totalPercent);
    } 
    
    else if (totalPercent < 40) 
    {
      System.out.println("You got " + totalPercent + " therefore you aren't passed.");
    } 
    
    else 
    {
      System.out.println("You are passed and your percentage is " + totalPercent);
    }
  }
}

public class BreakAndContinue
{
    public static void main(String args[])
    {
        for(int i = 1; i<= 10; i++)
        {
            if(i == 3)
            {
                System.out.println("Skipping an iteration");
                continue;
            }
            
            if(i == 7)
            {
                System.out.println("Breaking out of the loop");
                break;
            }
            
            System.out.println(i);
            System.out.println("cout<<\"Java >>>>>>>>>> C++\"<<endl");
        }
        System.out.println("out of the loop lol");
    }
}

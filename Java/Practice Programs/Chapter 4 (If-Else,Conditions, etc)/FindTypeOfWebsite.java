import java.util.Scanner;

public class FindTypeOfWebsite {
    public static void main(String[] args) {
        System.out.print("Enter a URL and we'll tell the type of website: ");
        Scanner sc = new Scanner(System.in);
        String url = sc.nextLine();
        sc.close();

        if(url.endsWith(".com"))
        {
            System.out.println("The website is a commercial website!");
        }

        else if(url.endsWith(".org"))
        {
            System.out.println("The website is an organisation website");
        }

        else if(url.endsWith(".in"))
        {
            System.out.println("The website is an Indian website!");
        }

        else
        {
            System.out.println("Sorry, couldn't find the type of website");
        }
    }
}

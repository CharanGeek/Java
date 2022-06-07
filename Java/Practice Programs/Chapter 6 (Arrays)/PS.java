import java.util.Scanner;

public class PS {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        /* 
        Question 1 -> Crate an array of 5 floats and print their sum
        
        float[] num = new float[5];
        float sum = 0;

        for(int i = 0; i < num.length; i++)
        {
            System.out.print("Enter the value of element "+(i + 1)+" : ");
            num[i] = sc.nextFloat();
        }

        sc.close();

        for(float element: num)
        {
            sum += element;
        }
        System.out.println("Sum of the elements is: "+sum);
        */

        // --------------------------------------------------------------------------------

        /*
        Question 2 -> Find weather a number is present in the array or not
        
        int[] num = new int[5];
        
        for(int i = 0; i < num.length; i++)
        {
            System.out.print("Enter the value of element "+(i + 1)+" : ");
            num[i] = sc.nextInt();
        }

        System.out.print("Enter the number you want to find in the array: ");
        int findNum = sc.nextInt();
        boolean isPresent = false;

        for(int element: num){
            if(element == findNum){
                isPresent = true;
                break;
            }
        }

        System.out.println(isPresent ? findNum+" is present in the given array" : findNum+" is present in the given array");
        */
        
        // --------------------------------------------------------------------------------

        /*
        Question 3 -> Calculate the average marks for students in Physics using for-each loop 
        
        float[] num = new float[5];
        float sum = 0;
        
        for(int i = 0; i < num.length; i++)
        {
            System.out.print("Enter the marks of student "+(i + 1)+": ");
            num[i] = sc.nextFloat();
        }

        for(float element: num)
        {
            sum += element;
        }

        float avg = sum / num.length;
        System.out.println("Average of all marks is: "+avg);
        */

        // --------------------------------------------------------------------------------

        /*
        Question 4 -> Add two matrices of size 2 x 3 
        
        System.out.print("Enter number of rows you want in the matrix: ");
        int r = sc.nextInt();

        System.out.print("Enter number of columns you want in the matrix: ");
        int c = sc.nextInt();

        float[][] A = new float[r][c];
        float[][] B = new float[r][c];
        float[][] C = new float[r][c];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print("Enter the value for matrix A ("+(i + 1)+", "+(j + 1)+") : ");
                A[i][j] = sc.nextFloat();
            }
        }
        
        System.out.println("-----------------------------------------");
        
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                System.out.print("Enter the value for matrix B ("+(i + 1)+", "+(j + 1)+") : ");
                B[i][j] = sc.nextFloat();
            }
        }
        
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[i].length; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        
        System.out.println("-----------------------------------------");

        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[i].length; j++) {
                System.out.print(C[i][j]+" ");
            }
            System.out.println();
        }
        */
        
        // --------------------------------------------------------------------------------
        /* 
          Question -> Reverse an array
        */

        int[] arr = {10,20,30,40,50};
        int temp = 0,endIndex = 0, len = arr.length;

        for (int i = 0; i < (len/2); i++) {
            endIndex = len - 1 - i;
            temp = arr[endIndex];
            arr[endIndex] = arr[i];
            arr[i] = temp;

        }

        for (int element : arr) {
            System.out.println(element);
        }
    }
}

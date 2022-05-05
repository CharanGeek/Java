public class SumOfFirst100NaturalNumber {
    public static void main(String[] args) {
        int a = 1;
        int sum = 0;

        while(a<=100){
            sum = a + sum;
            a++;
        }

        System.out.println(sum);
    }
}

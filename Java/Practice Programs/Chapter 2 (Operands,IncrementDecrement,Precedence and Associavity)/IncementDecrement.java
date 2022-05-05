public class IncementDecrement {
    public static void main(String[] args) {
        double k = 44.31342d;
        double d = k++; //first k is assigned to d then it is incremented (here d = 44.31342 and k = 45.31342)
        System.out.println(d);
        System.out.println(k);

        // INCREMENTING A CHARACTER
        char myChar = 'd';
        System.out.println(++myChar);
    }
}

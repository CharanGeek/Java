public class DisplayArray {
    public static void main(String[] args) {

        float[] marks = {42.52F,334.14F,56.254F,24.1F};

        // Using for loop (array traversal)
        for(int i = 0; i < marks.length; i++)
        {
            System.out.println(marks[i]);
        }

        System.out.println("------------------------------");

        // Using for-each loop
        for (float element : marks) {
            System.out.println(element);
        }
    }
}

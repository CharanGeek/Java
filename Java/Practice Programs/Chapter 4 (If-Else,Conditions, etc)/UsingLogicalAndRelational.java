public class UsingLogicalAndRelational {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        // USING LOGICAL AND(&&)
        if (a && b) {
            System.out.println("Turu Lob ;) AND wala");
        } 
        
        else {
            System.out.println("Sed false AND wala");
        }


        // USING LOGICAL OR (||)
        if (a || b) {
            System.out.println("Turu Lob ;) OR wala");
        } 
        
        else {
            System.out.println("Sed false OR wala");
        }

        // USING LOGICAL NOT (!)
        System.out.print("Not(a) is ");
        System.out.println(!a);
        System.out.print("Not(b) is ");
        System.out.println(!b);
    }
}

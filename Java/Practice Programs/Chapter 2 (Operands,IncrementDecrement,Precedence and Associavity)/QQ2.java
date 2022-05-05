public class QQ2 {
    public static void main(String[] args) {

        // ALL ALONG THE VALUE OF m,b and i WILL BE 44 BECAUSE AT FIRST m IS ASSSIGNED TO b THEN IT IS INCREMENTED (m = 45)
        // IN INT i FIRST THE VALUE OF m IS DECREMENTED (m=44) THEN IT IS ASSIGNED TO i
        int m = 44;
        int b = m++;
        int i = --m;

        System.out.println(m);
        System.out.println(b);
        System.out.println(i);
    }
}

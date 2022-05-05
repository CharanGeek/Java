public class trianglePattern{
    public static void main(String[] args) {
        String str = "A";
        int m;
        for(m=1;m<=4;m++,str = str + "A"){
            System.out.println(str);
        }
    }
}
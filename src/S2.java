//Write a Java program to count a number of Unicode
// code points in the specified text range of a String
public class S2 {
    public static void main(String[] args) {
        String s="elektrobit.com";
        int c=s.codePointCount(0,9);
        System.out.println(c);
    }
}

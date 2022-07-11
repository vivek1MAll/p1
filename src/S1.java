//Write a Java program to get the character (Unicode code point)
//        at the given index within the String
public class S1 {
    public static void main(String[] args) {
        String s="vivek_mall";
        System.out.println(s);
        int c=s.charAt(0);
        int v=s.charAt(1);
        int q=s.codePointAt(0);
        int q1=s.codePointAt(1);
        System.out.println("the caharter at 0 index  "+c);
        System.out.println("the cahre at 9 index"+v);
        System.out.println("the code opint at 0"+q);
        System.out.println("the code point at 1"+q1);

    }
}

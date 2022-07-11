import java.util.Calendar;
import java.util.Locale;

//Write a Java program to compare two strings lexicographically
// ignoring case differences
public class S4 {
    public static void main(String[] args) {
        String s="Elektrobit.pvt.ltd";
        String s1="elektrobit.pvt.ltd";
        int c=s.compareToIgnoreCase(s1);
        if (c>0){
            System.out.println("both are not equal"+c);
        }else if(c<0){
            System.out.println("both are not eqaul");
        }else {
            System.out.println("both are equal");
        }
//        Write a Java program to concatenate a given string to
//        the end of another string.
                System.out.println(s+s1);
//Write a Java program to test if a given
// string contains the specified sequence of char values.
        boolean a=s.contentEquals(s1);
        System.out.println("a  "+a);
        boolean w=s.contains("and");
        System.out.println("the same value of "+w);
        System.out.println("current date and time ");
        Calendar r=Calendar.getInstance();
        System.out.format("the value of r is ",r);
        System.out.format("%tB %te,%tY%n",r,r,r);
//        System.out.format("%t1:%tM %tp%n",r,r,r);
//      Write a Java program to
//      create a unique identifier of a given string.
        int str1=s.hashCode();
        System.out.println(str1);





    }
}

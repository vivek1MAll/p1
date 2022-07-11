//Write a Java program to compare two strings lexicographically.
// Two strings are lexicographically equal if they are the same
// length and contain the same characters in the same positions
public class S3 {
    public static void main(String[] args) {
        String s="elektrobit.com";
        String s1="continantal.com";
        String s3="elektrobit.com";

        int c=s.compareTo(s1);
        int q=s.compareTo(s3);

        System.out.println(c);
        System.out.println(q);

        if(q>0){
            System.out.println("the value of c is the less");
        } else if (q<0) {
            System.out.println("the value of the more");
        }else{
            System.out.println("both are equal");
        }


    }
}

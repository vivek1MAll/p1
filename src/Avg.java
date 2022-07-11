import java.util.Scanner;

public class Avg {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.println("enter the first value ");
        int a=s.nextInt();
        System.out.println("enter the first value ");
        int b=s.nextInt();
        System.out.println("enter the secound value ");
        int c=s.nextInt();
        System.out.println("enter the third value ");
        int d=s.nextInt();
        System.out.println("enter the forth value ");
        int e=s.nextInt();
        int su=(a+b+c+d+e);
        System.out.println("the sum of the value is :"+su);
        int av=(su/5);
        System.out.println("avrage of number is :"+av);
    }
}

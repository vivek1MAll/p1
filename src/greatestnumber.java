import java.util.Scanner;

public class greatestnumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the first number");
        int a=s.nextInt();
        System.out.println("enter the secound number");
        int b=s.nextInt();
        System.out.println("enter the third numkber");
        int c=s.nextInt();

        if ((a > b) & (a > c ))
        {
            System.out.println("a is gratest number" +a);
        }
        else if((b>a) & (b>c)){
            System.out.println("b is the greatest number"+b);
        }
        else{
            System.out.print("the c is gratest numeber"+c);
        }
    }
    }


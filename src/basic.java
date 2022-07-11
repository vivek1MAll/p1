import java.util.Scanner;

public class basic {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("enter the number");
        int input =in.nextInt();
        if (input > 0)
        {
            System.out.println("the number is positive");
        }
        else if(input< 0){
            System.out.print("the number is negative");
        }
        else{
            System.out.print("the number is zero");
        }

    }
}

import java.util.Scanner;

public class Switch_case_example {
    public static void main(String[] args) {
//        write a program to check user have age is 12,14,16,18;
        System.out.println("enter the age ");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();


        switch (a){
            case 10:System.out.println("the age is 10");
            break;
            case 1:if (a==1){ System.out.println("the age is 12");}
            break;
            case 14:System.out.println("the age is 14");
            break;
            case 16:System.out.println("the age is 16");
            break;
            case 18:System.out.println("the age is 18");
            break;
            default:System.out.println("not valid");

        }


    }
}

import java.util.Scanner;

public class weekdays {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter the day of week");
        int a =s.nextInt();
        if (a==1 || a==2 || a==3 || a==4 || a==5 || a==6 || a==7 ){
            System.out.println("you enter the right week days");
            if(a==1){
                System.out.println("the day is monday");
            }
            if(a==2){
                System.out.println("the value of the tuseday");
            }

        }
    }
}

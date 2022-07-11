import java.util.Locale;
import java.util.Scanner;

public class Constant {
    public static void main(String[] args) {
        System.out.println("enter the charater");
        Scanner s=new Scanner(System.in);

        String c= s.next().toLowerCase(Locale.ROOT);
        if (c.equals("a") || c.equals("e") || c.equals("i") || c.equals("o") || c.equals("u")){
            System.out.println("you enter vowel"+c);
        }
        else{
            System.out.print("you enter a consonent"+c);
        }
        }
    }


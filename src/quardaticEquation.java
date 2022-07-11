import java.util.Scanner;

public class quardaticEquation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b, c, d;
        System.out.println("the value of a ");
        a = s.nextInt();
        System.out.println("the value of b");
        b = s.nextInt();
        System.out.println("the value of c");
        c = s.nextInt();
        d = -(b * b - 4 * a * c);

        if (d > 0) {
            double r1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);
            System.out.println(r1);
            double r2 = (-b + Math.pow(d, 0.5) / (2.0 * a));
            System.out.print(r2);

        } else if (d == 0) {
            System.out.println("the root are equal");
            System.out.print(-b / 2 * a);

        }
    }
}
public class Opraters {
    public static void main(String[] args) {
//        Java Unary Operator Example: ++ and --
int x=10;
System.out.println(x++);
        System.out.println(++x);
        System.out.println(x--);
        System.out.println(--x);

//        example 2
        int a=1;
        int b=2;
        char ch ='a';
        boolean c=true;
        boolean d=false;
        System.out.println(~a);
        System.out.println(~b);
        System.out.println(!c);
        System.out.println(!d);
        System.out.println(~ch);
        System.out.println("___________________________________");


//      shift operatorExample
        System.out.println(2<<4);
        System.out.println(0>>4);
        System.out.println(2<<2);
        System.out.println(2<<4);
        System.out.println("___________________________________");
// diffreance between (>> vs >>>)
        System.out.println(20>>2);
        System.out.println(2>>>3);
        System.out.println("___________________________________");
//right shift opraters
        System.out.println(10>>2);
//10/2^2=10/4=2
        System.out.println(20>>2);
        System.out.println(20>>3);
        System.out.println("___________________________________");
//AND operator example:Logical && and bitwise &
        System.out.println(a<b && a<x);
        System.out.println(a<b & a<x);

        System.out.println("___________________________________");
//        logical || and bitwise |
        System.out.println(a>x||a>x);
        System.out.println(a>x|a<x);
        System.out.println("___________________________________");
//ternary operator
        int q=1;
        int w=2;
        int min=(q<w)?q:w;
        System.out.println("vivek  "+min);
////ternary operator
        System.out.println("------------------------------------");
        short a1=10;
        short b1=10;
        short e;
 e=(short)(a1+b1);
System.out.println(e);
//
        byte t = 64, y;
        int i;

        i = a << 2;
        y = (byte)(t << 2);
        System.out.println("Original value of a: " + t);
        System.out.println("i and b: " + i + " " + y);


    }
    }





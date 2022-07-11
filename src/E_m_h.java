import java.io.*;
import java.lang.*;
import java.util.*;

interface one1 {
    public void print_geek();
}

interface two2 {
    public void print_for();
}

interface three3 extends one1, two2 {
    public void print_geek();
}
class child implements three3 {
    @Override public void print_geek()
    {
        System.out.println("multiple");
    }

    public void print_for() { System.out.println("inheritance"); }
}

// Drived class
public class E_m_h {
    public static void main(String[] args)
    {
        child c = new child();
        c.print_geek();
        c.print_for();
        System.out.println("achive");

    }
}

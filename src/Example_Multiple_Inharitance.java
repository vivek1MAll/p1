import java.lang.*;
interface one{
    public void print_one();
}
interface two{
    public void print_two();
}
interface three extends one,two{
    public void print_one();
}
class caption implements three {
    public void print_one()
    {
        System.out.println("vivek");
    }
    @Override
    public void print_two() {

    }
    public class Example_Multiple_Inheritance {
        public static void main(String[] args) {
            caption c = new caption();
            c.print_two();
            c.print_one();
            c.print_two();

        }
    }
}
import java.util.ArrayList;
import java.util.Collection;

//Write a Java program to create a new array list,
// add some colors (string) and print out the collection.
public class PracticeOnArraylist {
    public static void main(String[] args) {
        ArrayList<String> s=new ArrayList<>();
        s.add("red");
        s.add("green");
        s.add("yellow");
        s.add("megenta");
        s.add("balck");
        System.out.println("the output colour " +s);
//Write a Java program to
//iterate through all elements in a array list.
        for (String element:s)
        {
            System.out.println(element);
        }
//Write a Java program to insert
//an element into the array list at the first position.
        s.add(0,"vivek");
        System.out.println(s);
// Write a Java program to retrieve
// an element (at a specified index) from a given array list
        String a=s.get(0);
        System.out.println(a);
//Write a Java program to
// update specific array element by given element
        s.set(0,"raju");
        System.out.println(s);
//. Write a Java program to remove the third element
// from an array list
        s.remove(3);
        System.out.println(s);
//        Write a Java program to search an
//        element in a array list
        boolean y=s.contains("yellow");
        System.out.println("yellow  "+y);
// Write a Java program to copy one array list into another.
        ArrayList<String>s1=new ArrayList<>();
        s1.addAll(s);
        System.out.println(s1);
// Write a Java program to reverse elements in an array list
// Write a Java program to shuffle elements in a array list




    }
}

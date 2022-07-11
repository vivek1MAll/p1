import java.lang.reflect.Array;
import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
//        int []a={1,2,3,4,};
//        String b[]={"java","python","c"};
//        Arrays.sort(a);
//        System.out.println(a);
//        System.out.println(Array.toString(a));

//        int a[] =[1, 2, 3, 4, 5, 6];
//        int sum = 0;
//        for (int i : a) {
//            sum += i;
//            System.out.println("the sum is " + sum);
//        int a[]={0,1,2,3,4};
//        int sum = 0;
//        int count=Array.getLength(a);
//        System.out.println(count);
//        for (int e:a){
//            sum += e;
//        }
////        System.out.println(sum/count);
//        int a[]={1,2,3,8,5,6,7};
//        for (int i:a)
//        {
////          System.out.println(a);
//            if(i==8){
//                System.out.println(true);
//            }
        int a[]={1,2,3,4,5};
        int position =2;
        int new_value=888;
        for (int i=a.length-1;i>position;i--){
            a[i]=a[i-1];
        }
        a[position]=new_value;
        System.out.println(Arrays.toString(a));

            }
        }




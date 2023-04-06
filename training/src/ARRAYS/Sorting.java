package ARRAYS;
import java.util.*;
public class Sorting {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
       System.out.println("Please enter how many integers in your array");
       n= sc.nextInt();
       int[] array=new int[n];

       for (int i=0;i<array.length;i++){
           System.out.println("Please enter the "+(i+1)+".number");
           array[i]= sc.nextInt();
       }
       System.out.println("our new array is "+Arrays.toString(array));
       Arrays.sort(array);
       System.out.println("sorted one is\t"+Arrays.toString(array));
    }
}

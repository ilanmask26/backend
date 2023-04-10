package ARRAYS;
import java.util.*;
public class Frequency {
    static boolean isRepeat(int[] arr,int number){
        for(int i=0;i<arr.length;i++){
            if (arr[i]==number){
                return true;

            }

        }
        return false;
    }
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter how many rows in your array");
        n= sc.nextInt();
        int[] array=new int[n];
        int[] tempArray=new int[array.length];
        int tempArrayIndex=0;
        for (int i=0;i<array.length;i++){
            System.out.println("please enter "+(i+1) +" .integer of array");
            array[i]= sc.nextInt();
        }
        for (int i=0;i<array.length;i++){
            int count=1;
            for (int j=0;j< array.length;j++){
                if (i!=j&&array[i]==array[j]){
                    count++;
                }
            }

            if (isRepeat(tempArray,array[i])==false){
                tempArray[tempArrayIndex]=array[i];
                tempArrayIndex++;
                System.out.println(array[i] + " number "+ count + " has repeated ");
            }
        }
    }
}

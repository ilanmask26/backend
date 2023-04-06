package ARRAYS;
import java.util.*;
public class Nearest {
    public static void main(String[] args) {
        int[] arr={1,2,3,60,70,90,-54,45,-45};
        int number;
        int nearest=arr[0];
        int smNear=0;
        int bgNear=0;

        System.out.println("please enter any number");
        Scanner sc =new Scanner(System.in);
        number=sc.nextInt();

        Arrays.sort(arr);
        for (int i=0;i<arr.length;i++){
            if (arr[i]<number){
                smNear=arr[i];
            }
            if (arr[i]>number){
                bgNear=arr[i];
                break;
            }


        }
        System.out.println("The nearest bigger number is "+bgNear+" the nearest small number is "+smNear);







    }



}

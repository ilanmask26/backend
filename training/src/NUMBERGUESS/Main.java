package NUMBERGUESS;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Random rand =new Random();
        int mystery=rand.nextInt(100);
        System.out.println(mystery);
        int number;
        int right=5;
        int[] wrongNumbers= new int[right];
        Scanner sc=new Scanner(System.in);
        while (right>0){
            System.out.println("please enter the number which you guess");
            number= sc.nextInt();
            if (number<0||number>100){
                System.out.println("number should be between 0 and 100");
                continue;
            }
            if (number==mystery){
                System.out.println("congratulations");
                break;
            }
            else {
                wrongNumbers[right-1]=number;

                if (number<mystery){
                    System.out.println("Wrong. number shorter than mystery number");
                }
                else {
                    System.out.println("Wrong. number longer than mystery number");
                }
                right--;
                System.out.println(" You left "+right);


            }

        }
        System.out.println(Arrays.toString(wrongNumbers));
    }
}

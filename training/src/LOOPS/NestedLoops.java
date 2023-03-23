package LOOPS;
import java.util.Scanner;
public class NestedLoops {
    public static void main(String[] args) {
        int number;
        Scanner sc=new Scanner(System.in);

        System.out.println("please enter a number");
        number=sc.nextInt();
        for (int i=1;i<=number;i++){
            for (int j=1;j<=number-i;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int a = 1; a <= number - 1; a++) {
            for (int b = 1; b <= a; b++) {
                System.out.print(" ");
            }
            for (int c = 1; c <= 2 * (number-a) - 1; c++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

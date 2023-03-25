package LOOPS;
import java.util.Scanner;
public class reverseTriangle {
    public static void main(String[] args) {
        int number;
        Scanner sc=new Scanner(System.in);

        System.out.println("please enter a number ");
        number=sc.nextInt();
        for (int i = 1; i <= number ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k=1;k<=2*(number-i)-1;k++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

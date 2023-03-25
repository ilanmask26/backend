package LOOPS;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        int number;
        int numberOne=0;
        int numberTwo=1;
        int total=0;
        Scanner sc=new Scanner(System.in);

        System.out.println("please enter how many lines do you want");
        number=sc.nextInt();
        for (int i=1;i<=number;i++){
            System.out.println(numberOne);
            total=numberOne+numberTwo;
            numberOne=numberTwo;
            numberTwo=total;


        }
    }
}

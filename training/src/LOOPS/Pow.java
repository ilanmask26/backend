package LOOPS;
import java.util.Scanner;
public class Pow {
    public static void main(String[] args) {
        int num;
        Scanner in=new Scanner(System.in);
        System.out.println("please enter a number");
        num=in.nextInt();

        for (int i=1;i<=num;i*=20){
            System.out.print("\n"+i);
        }
    }
}

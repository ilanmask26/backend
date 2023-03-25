package LOOPS;
import  java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        int number,tot=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        number= sc.nextInt();
        for (int i=1;i<number;i++){
            if (number%i==0){
                tot+=i;
            }

        }
        if (number==tot){
            System.out.println("your number is a perfect number "+number);

        }
        else System.out.println("your number is not a perfect number " +tot);
    }
}

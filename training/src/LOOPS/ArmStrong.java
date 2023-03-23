package LOOPS;
import java.util.Scanner;
public class ArmStrong {
    public static void main(String[] args) {
        int number;
        int var;
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the number");
        number=sc.nextInt();
        int tempNumber=number;
        int count=0;
        int result=1;
        int total=0;
        while (tempNumber!=0){
            tempNumber/=10;
            count++;
        }
        //count indicate how many digits are number
        tempNumber=number;
        //now we refreshed the tempNumber
        while (tempNumber!=0){
            var=tempNumber%10;
            //exponential process
            total += Math.pow(var, count);
            tempNumber/=10;
        }
        System.out.println(total);
        if (total==number){
            System.out.println("this variable is armstrong number " +total+" = "+number);
        }
        else System.out.println("this variable is not armstrong number ");



    }
}

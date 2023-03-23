package LOOPS;
import java.util.Scanner;
public class harmonic {
    public static void main(String[] args) {
        int n;
        float result=0.f;
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the number ");
        n= sc.nextInt();
        for (int i=1;i<=n;i++){
            result+=(1.0/i);
        }
        System.out.println("your result is "+ result);
    }
}

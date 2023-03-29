package METHODE;
import java.util.Scanner;

public class recusive {
    static int fibonacci(int num){
        if (num==1||num==2||num==0)return 1;
        return fibonacci(num-1)+fibonacci(num-2);

    }

    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n= sc.nextInt();
        System.out.println(fibonacci(n));
    }
}

package METHODE;
import java.util.Scanner;
public class PrimeNumber {
    static boolean isPrime(int a){
        boolean is=true;
        for (int i=2;i<a;i++){
            if(a%i==0){
                is=false;
            }
        }
        return is;

    }

    public static void main(String[] args) {
        int number;
        Scanner sc=new Scanner(System.in);
        number= sc.nextInt();
        System.out.println(isPrime(number));
    }
}

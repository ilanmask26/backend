package METHODE;
import java.util.Scanner;

public class Pattern {
    static void pat(int number){
        int i=number;
        System.out.println(i);
        do {
            i-=5;
            System.out.println(i);


        }while ( i>=0);

        while (i<=number){

            i+=5;
            System.out.println(i);
        }

    }

    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n= sc.nextInt();
        pat(n);

    }
}

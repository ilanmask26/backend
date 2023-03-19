package WORKS;
import java.util.Scanner;
public class sorting {
    public static void main(String[] args) {
        int a,b,c;
        Scanner inp=new Scanner(System.in);

        System.out.println("enter a value");
        a=inp.nextInt();

        System.out.println("enter b value");
        b=inp.nextInt();

        System.out.println("enter c value");
        c=inp.nextInt();

        if (a>b&&a>c&&b>c){
            System.out.println(a+">"+b+">"+c);
        }

        if (a>b&&a>c&&c>b){
            System.out.println(a+">"+c+">"+b);
        }

        if (b>a&&b>c&&a>c){
            System.out.println(b+">"+a+">"+c);
        }

        if (b>a&&b>c&&c>a){
            System.out.println(b+">"+c+">"+a);
        }

        if (c>b&&c>a&&b>a){
            System.out.println(c+">"+b+">"+a);
        }

        if (c>b&&c>a&&a>b){
            System.out.println(c+">"+a+">"+b);
        }

    }
}

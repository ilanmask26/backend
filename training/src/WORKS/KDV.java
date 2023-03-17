package WORKS;

import java.util.Scanner;
public class KDV {
    public static void main(String[] args) {
        double price,tax,total;
        // we appended the scanner variable
        Scanner inp=new Scanner(System.in);

        System.out.print("please enter your product price:");
        price=inp.nextFloat();

        tax= price>1000 ? (price*8/100):(price*18/100);
        total=price+tax;

        System.out.println("price:"+price);
        System.out.println("total:"+total);
        System.out.println("tax:"+tax);


    }
}

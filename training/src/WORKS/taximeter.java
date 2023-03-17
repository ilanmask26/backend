package WORKS;
import  java.util.Scanner;

public class taximeter {
    public static void main(String[] args) {
        double gone_km,lunch=10.0,min=20.0,per_km_paid=2.20,total,tot;
        Scanner input=new Scanner(System.in);

        System.out.print("please enter how many kilometers did you go:");
        gone_km=input.nextDouble();
        total=lunch+per_km_paid*gone_km;
        tot=(total>min) ? total : min;
        System.out.println("total salary"+tot);






    }
}

package WORKS;
import  java.util.Scanner;
public class radius {
    public static void main(String[] args) {
        double r,area,circumference,pi=3.14;
        int d;

        Scanner input= new Scanner(System.in);

        System.out.print("please enter your radius");
        r=input.nextDouble();

        System.out.print("Please enter your degree");
        d=input.nextInt();

        area= d*pi*Math.pow(r,2)/360;
        circumference=(d*2*pi*r)/360;


        System.out.println("area is:"+area);
        System.out.println("circumference is:"+circumference);



    }
}

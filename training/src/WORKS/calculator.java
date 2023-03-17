package WORKS;
import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        float x1,x2,conclusion;
        int process;
        Scanner inp=new Scanner(System.in);

        System.out.print("enter the first variable: ");
        x1=inp.nextFloat();

        System.out.print("enter the second variable: ");
        x2=inp.nextFloat();

        System.out.print("choose your process\n1)addition:\n2)extraction:\n3)division:\n4)multiplication:");
        process=inp.nextInt();

        switch (process){
            case 1:
                System.out.print("addition :"+(x1+x2));
                break;
            case 2:
                System.out.print("extraction:"+(x1-x2));
                break;
            case 3:
                if(x2==0){
                    System.out.println("invalid value ");
                }
                else {
                    System.out.println("divison:"+(x1/x2));
                }
                break;
            case 4:
                System.out.println("multiplicaiton:"+(x1*x2));
                break;
            default:
                System.out.println("invalid case");




        }



    }

}

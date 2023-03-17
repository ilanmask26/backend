package WORKS;
import java.util.Scanner;
public class Body_Mass_Index {
    public static void main(String[] args) {
        double your_weight,your_height,index;
        Scanner input=new Scanner(System.in);

        System.out.print("please enter your body weight: ");
        your_weight=input.nextDouble();

        System.out.print("please enter your height: ");
        your_height=input.nextDouble();

        index=(your_weight/Math.pow(your_height,2));
        System.out.println("your body mass index is:"+index);


    }
}

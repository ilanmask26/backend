package WORKS;
import java.util.Scanner;
public class GreenGrocer {
    public static void main(String[] args) {
        float pear=2.14f,apple=3.67f,tomatoes=1.11f,banana=0.95f,aubergine=5.00f;
        float pear_kg,apple_kg,tomatoes_kg,banana_kg,aubergine_kg;
        float total;
        Scanner input = new Scanner(System.in);

        System.out.print("how many kilograms did you buy to pear:");
        pear_kg=input.nextFloat();

        System.out.print("how many kilograms did you buy to apple:");
        apple_kg=input.nextFloat();

        System.out.print("how many kilograms did you buy to tomatoes:");
        tomatoes_kg=input.nextFloat();

        System.out.print("how many kilograms did you buy to bananas:");
        banana_kg=input.nextFloat();

        System.out.print("how many kilograms did you buy to aubergine:");
        aubergine_kg=input.nextFloat();

        total=(pear*pear_kg)+(apple*apple_kg)+(tomatoes*tomatoes_kg)+(banana_kg*banana)+(aubergine_kg*aubergine);
        System.out.println("total"+total);




    }

}

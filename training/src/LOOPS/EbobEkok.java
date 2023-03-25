package LOOPS;
import java.util.Scanner;
public class EbobEkok {
    public static void main(String[] args) {
        int number1,number2,i=1,ebob=1,ekok;
        Scanner sc=new Scanner(System.in);

        System.out.println("please enter number 1");
        number1= sc.nextInt();

        System.out.println("please enter number 2");
        number2= sc.nextInt();

        if (number1<=0&&number2<=0){
            while (number1>=i&&number2>=i){
                i++;
                if (number1%i==0&&number2%i==0){
                    ebob=i;

                }

            }



        }
        ekok=(number1*number2)/ebob;
        System.out.println("ebob"+ebob);
        System.out.println("ekok"+ekok);


    }
}

package LOOPS;
import java.util.Scanner;
public class ExponentialNumber {
    public static void main(String[] args) {
        int bot,top,conc = 1;
        Scanner in=new Scanner(System.in);

        System.out.println("please enter bot");
        bot=in.nextInt();

        System.out.println("please enter top");
        top=in.nextInt();

        for (int i=1;i<=top;i++){
            conc=conc*bot;
        }
        System.out.println(conc);
    }
}

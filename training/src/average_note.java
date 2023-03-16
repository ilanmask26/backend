
import java.util.Scanner;
public class average_note {

    public static void main(String[] args) {
        int english,maths,science,geometry;

        //we definated our input variables
        Scanner input= new Scanner(System.in);

        System.out.print("please enter your english note:");
        maths= input.nextInt();

        System.out.print("please enter your english note:");
        science= input.nextInt();

        System.out.print("please enter your english note:");
        english= input.nextInt();

        System.out.print("please enter your english note:");
        geometry= input.nextInt();


        float average=(maths+english+science+geometry)/4;
        boolean Conclue = (average>50);
        String str= Conclue ? "pass":"fail";
        System.out.println(str);








    }
}

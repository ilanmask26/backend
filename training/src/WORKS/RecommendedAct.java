package WORKS;
import java.util.Scanner;
public class RecommendedAct {
    /*
        if the weather between  -5 and 5, program would offer  sking
        if the weather between  5 and 25, program would  offer going cinema
        if the weather between 15 and 25, program would  offer going picnic
        if the weather hotter than 25 degrees, program would offer swimming
        */
    public static void main(String[] args) {
        int heat;
        System.out.println("please enter that how many degrees are the weather");
        Scanner inp= new Scanner(System.in);
        heat=inp.nextInt();

        if (-5<heat && heat<=5){
            System.out.println("you can go sking");
        } else if (5<heat && heat<=25) {
            if (15<heat && heat<=25){
                System.out.println("you can go picnic");
            }
            System.out.println("you can go cinema");


        }
        else if(heat>25){
            System.out.println("you can go swimming");

        }



    }
}

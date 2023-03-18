package WORKS;
import  java.util.Scanner;
public class AverageNote2 {
    public static void main(String[] args) {
        int maths,physics,chemical,english,gym,count=5;
        float average;
        Scanner input=new Scanner(System.in);

        System.out.println("please enter your maths note:");
        maths=input.nextInt();

        System.out.println("please enter your physics note:");
        physics=input.nextInt();

        System.out.println("please enter your chemical note:");
        chemical=input.nextInt();

        System.out.println("please enter your english note:");
        english=input.nextInt();

        System.out.println("please enter your gym note bro:");
        gym=input.nextInt();
        if(maths<0||maths>100){
            maths=0;
            count--;
        }
        if(physics<0||physics>100){
            physics=0;
            count--;
        }
        if(chemical<0||chemical>100){
            chemical=0;
            count--;
        }
        if(english<0||english>100){
            english=0;
            count--;
        }
        if(gym<0||gym>100){
            gym=0;
            count--;
        }
        if (english!=0&&maths!=0&&physics!=0&&gym!=0&&chemical!=0){
            average=(maths+physics+chemical+gym+english)/count;
            String str=(average>=55)?"pass":"fail";
            System.out.println(str);




        }
        else {
            System.out.println("are you kidding me");
        }












    }
}

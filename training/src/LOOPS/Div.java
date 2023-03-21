package LOOPS;
import java.util.Scanner;
public class Div {
    public static void main(String[] args) {
        int total=0,i,count=0,num;
        boolean Is=true;
        Scanner inp=new Scanner(System.in);

        do {
            System.out.println("please enter a number");
            num=inp.nextInt();
            if (num%2==1){
                System.out.println("number correct");
                Is=false;
                //critical
                for (i=0;i<=num;i++){
                    if (i%4==0&&i!=0){
                        count++;
                        total+=i;
                    }
                }
                float div=total/count;
                System.out.println("div="+div);
            }
            else {
                System.out.println("please enter a odd number");

            }





        }while (Is);

    }
}

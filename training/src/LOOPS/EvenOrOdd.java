package LOOPS;
import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[] args) {
        int i=0, num=0,count=0,total=0;
        Scanner inp=new Scanner(System.in);
        System.out.println("please enter a number");
        num=inp.nextInt();
        for (i=0;i<=num;i++){
            if(i%12==0&&i!=0){
                count++;
                total+=i;
            }
        }
        if (count>0){
            float av=total/count;
            System.out.print("average: "+av);

        }
        else System.out.println("invalid number");



    }
}

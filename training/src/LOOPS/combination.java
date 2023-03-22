package LOOPS;
import java.util.Scanner;
public class combination {
    public static void main(String[] args) {
        int number,n=1,r,total=1,per,m,tot=0;
        Scanner in=new Scanner(System.in);

        System.out.println("please enter a number");
        number=in.nextInt();
        for (int i=1;i<=number;i++){
            n*=i;
        }
        System.out.println("please enter a number r");
        r=in.nextInt();
        for (int j=1;j<=r;j++){
            total*=j;
        }
        m=number-r;
        for (int k=1;k<=m;k++){
            tot*=k;
        }
        per=n/(r*m);
        System.out.println(per);




    }
}

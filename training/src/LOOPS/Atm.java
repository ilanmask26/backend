package LOOPS;
import java.util.Scanner;
public class Atm {
    public static void main(String[] args) {
        int choose, balance=3000,right=3,withdraw;
        String password="",userName="";
        Scanner sc=new Scanner(System.in);
        do {
            System.out.println("please enter your username");
            userName=sc.nextLine();
            System.out.println("please enter your password");
            password= sc.nextLine();
            if (userName.equals("patika")&&password.equals("dev")){
                System.out.print("please choose your process\n1)withdraw\n2)deposit\n3)banance\n4)exit\n");
                choose=sc.nextInt();
                switch (choose){
                    case 1:
                        System.out.println("please write how much money do you withdraw");
                        withdraw= sc.nextInt();
                        balance+=withdraw;
                        System.out.println("your balance is "+balance);

                        break;
                    case 2:
                        System.out.println("please write how much money do you withdraw");
                        withdraw= sc.nextInt();
                        balance-=withdraw;
                        System.out.println("your balance is "+balance);

                        break;
                    case 3:
                        System.out.println("your balance is "+balance);
                        break;
                    case 4:

                        break;
                }
            }
            else {
                right--;
                System.out.println("please enter your password correctly you have "+right+" left");


            }
            if (right==0)System.out.println("BY BY ");
        }while ((right>0));




    }
}

package WORKS;
import java.util.Scanner;
public class password {
    public static void main(String[] args) {
       String username="ilhan",password="java",new_password,log_password,log_username;
       int select;
       Scanner inp= new Scanner(System.in);

       System.out.println("please enter your username:");
       log_username= inp.nextLine();

       if(log_username.equals(username)){

           System.out.println("please enter your password:");
           log_password=inp.nextLine();
           if (log_password.equals(password)){
               System.out.println("Hello Mr ilhan");
           }
           else {
               System.out.println("entered password is not correct. Would you want to change yor password:\n1)y\n2)n\n");
               select=inp.nextInt();
               switch (select){
                   case 1:
                       System.out.println("please enter your new password");
                       new_password=inp.next();
                       if (password.equals(new_password)){
                           System.out.println("new password cannot equals to old ");
                       }
                       else {
                           System.out.println("new password is "+new_password);

                       }
                       break;
                   case 2:
                       System.out.println(" good by mr ilhan see you later ");
                       break;
                   default:
                       System.out.println("invalid number");

               }
           }




       }
       else{
           System.out.println("there are not found" +log_username);
       }

    }
}

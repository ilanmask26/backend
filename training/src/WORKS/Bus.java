package WORKS;
import java.util.Scanner;
public class Bus {
    public static void main(String[] args) {
        int adult,child,young, normal,distance,age;
        float per=0.1f,total,discount,simple,round_discount;
        int type;
        Scanner input= new Scanner(System.in);

        System.out.println("enter total distance:");
        distance=input.nextInt();
        total=per*distance;
        System.out.println("could you buy departure or round trip \n1)departure\n2)round trip ");
        type=input.nextInt();
        System.out.println("enter your age");
        age=input.nextInt();
        if((type==1||type==2)&&(age>=0&&age<=100)){


            switch (type){
                case 1:
                    if (age>=65){
                        discount=total*3/10;
                        simple=total-discount;
                        System.out.print("total= "+total+"\ndiscount=" +discount+ "\n-"+"\n--------"+"\nsimple= "+simple);
                    }
                    if (age>=12&&age<=24){
                        discount=total*1/10;
                        simple=total-discount;
                        System.out.print("total= "+total+"\ndiscount= "+ discount+"\n-"+"\n--------"+"\nsimple= "+simple);
                    }
                    if (age<12){
                        discount=total*5/10;
                        simple=total-discount;
                        System.out.print("total= "+total+"\ndiscount= "+ discount+"\n-"+"\n--------"+"\nsimple= "+simple);

                    }

                    break;
                case 2:
                    round_discount=total*2/10;

                    if (age>=65){
                        discount=total*3/10;
                        simple=total-discount-round_discount;
                        System.out.print("total= "+total+"\ndiscount=" +(discount+round_discount)+ "\n-"+"\n--------"+"\nsimple= "+simple);

                    }
                    if (age>=12&&age<=24){
                        discount=total*1/10;
                        simple=total-discount-round_discount;
                        System.out.print("total= "+total+"\ndiscount=" +(discount+round_discount)+ "\n-"+"\n--------"+"\nsimple= "+simple);

                    }
                    if (age<12){
                        discount=total*5/10;
                        simple=total-discount-round_discount;
                        System.out.print("total= "+total+"\ndiscount=" +(discount+round_discount)+ "\n-"+"\n--------"+"\nsimple= "+simple);

                    }




                    break;
                default:

            }


        }
        else {
            System.out.println("invalid number");
        }






    }
}

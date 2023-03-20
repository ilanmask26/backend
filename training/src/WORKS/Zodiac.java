package WORKS;
import  java.util.Scanner;
public class Zodiac {
    public static void main(String[] args) {
        int zodiac,date;
        String str="";
        Scanner input=new Scanner(System.in);

        System.out.println("please enter when year did you born: ");
        date=input.nextInt();

        zodiac=date%12;
        switch (zodiac){
            case 0:
                str="monkey";
                System.out.println("your zodiac horoscope is " +str);
                break;
            case 1:
                str="cockerel";
                System.out.println("your zodiac horoscope is " +str);
                break;
            case 2:
                str="dog";
                System.out.println("your zodiac horoscope is" +str);

                break;
            case 3:
                str="pig";
                System.out.println("your zodiac horoscope is " +str);
                break;
            case 4:
                str="mouse";
                System.out.println("your zodiac horoscope is " +str);
                break;
            case 5:
                str="Ox";
                System.out.println("your zodiac horoscope is " +str);
                break;
            case 6:
                str="tiger";
                System.out.println("your zodiac horoscope is "+str);
                break;
            case 7:
                str="Rabbit";
                System.out.println("your zodiac horoscope is " +str);
                break;
            case 8:
                str="dragon";
                System.out.println("your zodiac horoscope is " +str);
                break;
            case 9:
                str="snake";
                System.out.println("your zodiac horoscope is " +str);
                break;
            case 10:
                str="horse";
                System.out.println("your zodiac horoscope is " +str);
                break;
            case 11:
                str="sheep";
                System.out.println("your zodiac horoscope is " +str);
                break;

        }

    }

}

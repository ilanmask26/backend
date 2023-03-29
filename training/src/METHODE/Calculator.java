package METHODE;
import java.util.Scanner;
public class Calculator {
    //toplama
    static int plus(int a,int b){
        int result=a+b;
        System.out.println(result);
        return result;
    }
    //çıkartma
    static int extraction(int a,int b){
        int result= a-b;
        System.out.println(result);
        return result;
    }
    //çarpma

    static int multiplication(int a,int b){
        int result=a*b;
        System.out.println(result);
        return result;
    }
    //bölme
    static double division(int a ,int b){
        int result=a/b;
        System.out.println(result);
        return result;
    }
    //faktöriyel

    static int factorial(int a ){
        int result=1;
        for (int i=1;i<=a;i++){
            result*=i;
        }
        return result;
    }
    //çevre
    static void square(int a,int b){
        int length=(a+b)*2;
        int area=a*b;
        System.out.println("your squares length is "+length+"\nYour squares area is "+area);
    }
    static int exponential(int bot,int top){
        int result=1;
        for(int i=1;i<=top;i++){
            result*=bot;

        }
        return result;
    }

    public static void main(String[] args) {
        int num1,num2;
        int choose;
        Scanner sc=new Scanner(System.in);

        System.out.println("please enter first number");
        num1= sc.nextInt();

        System.out.println("please enter second number");
        num2= sc.nextInt();

        System.out.println("please choose your process\n1-plus\n2-extraction\n3-multiplication\n4-division\n5-square\n6-factorial\n7-exponantial");
        choose= sc.nextInt();
        switch (choose){
            case 1:
                System.out.println(plus(num1,num2));
                break;
            case  2:
                System.out.println(extraction(num1,num2));
                break;
            case 3:
                System.out.println(multiplication(num1,num2));
                break;
            case 4:
                System.out.println(division(num1,num2));
                break;
            case 5:
                square(num1,num2);
                break;
            case 6:
                System.out.println(factorial(num1));
                break;
            case 7:
                System.out.println(exponential(num1,num2));

        }
    }
}

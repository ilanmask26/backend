package LOOPS;
import java.util.Scanner;
public class MinMax {
    public static void main(String[] args) {
        int n, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz: ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". sayıyı giriniz: ");
            int sayi = input.nextInt();
            if (sayi > max) {
                max = sayi;
            }
            if (sayi < min) {
                min = sayi;
            }
        }

        System.out.println(max);
        System.out.println(min);
    }
}

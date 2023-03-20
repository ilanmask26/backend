package WORKS;
import java.util.Scanner;
public class Horoscope {
    public static void main(String[] args) {

        /*
        Koç Burcu : 21 Mart - 20 Nisan

        Boğa Burcu : 21 Nisan - 21 Mayıs

        İkizler Burcu : 22 Mayıs - 22 Haziran

         Yengeç Burcu : 23 Haziran - 22 Temmuz

        Aslan Burcu : 23 Temmuz - 22 Ağustos

        Başak Burcu : 23 Ağustos - 22 Eylül

        Terazi Burcu : 23 Eylül - 22 Ekim

        Akrep Burcu : 23 Ekim - 21 Kasım

        Yay Burcu : 22 Kasım - 21 Aralık

       Oğlak Burcu : 22 Aralık - 21 Ocak

       Kova Burcu : 22 Ocak - 19 Şubat

        Balık Burcu : 20 Şubat - 20 Mart
         */
        int day, month;
        String horoscope="";
        Scanner inp= new Scanner(System.in);
        
        System.out.println("month:");
        month=inp.nextInt();


        if (month>=1&&month<=12){
            System.out.println("day:");
            day=inp.nextInt();
            if (month==1){
                if(day>=1&&day<=21){
                    horoscope="capricorn";
                }
                else if(day>=22&&day<=31) {
                    horoscope="aquarius";
                }
                else {
                    System.out.println("invalid number");
                }


            } else if (month==2) {
                if(day>=1&&day<20){
                    horoscope="aquarius";
                } else if (day>=20&&day<=28) {
                    horoscope="pisces";

                }
                else {
                    System.out.println("invalid number");
                }

            } else if (month==3) {
                if (day>=1&&day<20){
                    horoscope="pisces";
                } else if (day>=20&&day<=31) {
                    horoscope="Aries";

                }
                else {
                    System.out.println("invalid number");
                }


            } else if (month==4) {
                if (day>=1&&day<=20){
                    horoscope="Aries";
                } else if (day>20&&day<=30) {
                    horoscope="Taurus";
                }
                else {
                    System.out.println("invalid number");
                }

            } else if (month==5) {
                if (day>=1&&day<=20){
                    horoscope="Taurus";
                } else if (day>20&&day<=30) {
                    horoscope="Gemini";
                }
                else {
                    System.out.println("invalid number");
                }


            } else if (month==6) {
                if (day>=1&&day<=20){
                    horoscope="Gemini";
                } else if (day>20&&day<=30) {
                    horoscope="Cancer";
                }
                else {
                    System.out.println("invalid number");
                }


            } else if (month==7) {
                if (day>=1&&day<=20){
                    horoscope="Cancer";
                } else if (day>20&&day<=30) {
                    horoscope="Lion";
                }
                else {
                    System.out.println("invalid number");
                }

            } else if (month==8) {
                if (day>=1&&day<=20){
                    horoscope="Lion";
                } else if (day>20&&day<=30) {
                    horoscope="Virgo";
                }
                else {
                    System.out.println("invalid number");
                }

            } else if (month==9) {
                if (day>=1&&day<=20){
                    horoscope="Virgo";
                } else if (day>20&&day<=30) {
                    horoscope="Libra";
                }
                else {
                    System.out.println("invalid number");
                }

            } else if (month==10) {
                if (day>=1&&day<=20){
                    horoscope=" Libra";
                } else if (day>20&&day<=30) {
                    horoscope="Scorpion";
                }
                else {
                    System.out.println("invalid number");
                }

            } else if (month==11) {
                if (day>=1&&day<=20){
                    horoscope="Scorpion";
                } else if (day>20&&day<=30) {
                    horoscope="Archer";
                }
                else {
                    System.out.println("invalid number");
                }

            } else if (month==12) {
                if (day>=1&&day<=20){
                    horoscope="Archer";
                } else if (day>20&&day<=30) {
                    horoscope="Capricorn";
                }
                else {
                    System.out.println("invalid number");
                }

            }

        }
        else {
            System.out.println("invalid number");
        }
    }
}

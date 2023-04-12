package MineSweeper;
import javax.swing.*;

import java.util.Random;
import java.util.Scanner;
public class Game{
    int gameCounter= 0;
    boolean control = true;
    int satir ,sutun;
    Random rnd = new Random();
    Scanner scn = new Scanner(System.in);

    String[][] create(String[][] panel){
        for (int i = 0 ; i<panel.length;i++){
            for (int j = 0 ; j<panel[i].length;j++){
                panel[i][j] = "-";
            }
        }
        return  panel;
    }
    void write(String[][] panel){
        for (int i = 0 ; i<panel.length;i++){
            for (int j = 0 ; j<panel[i].length;j++){
                System.out.print(panel[i][j]);
            }
            System.out.println();
        }
    }
    String[][] createPanel(){

        System.out.print("please enter how many row are there : ");
        this.satir = scn.nextInt();
        System.out.print("Please enter how many  column : ");
        this.sutun = scn.nextInt();
        String[][] panel = new String[this.satir][this.sutun] ;
        panel = create(panel);
        return panel;
    }
    String[][] BombPanel(String[][] bombPanel){
        int rndsatir,rndsutun;
        for (int i = 0 ; i<(satir*sutun)/4;i++){
            rndsatir = rnd.nextInt(this.satir);
            rndsutun = rnd.nextInt(this.sutun);
            if (bombPanel[rndsatir][rndsutun].equals("-")){
                bombPanel[rndsatir][rndsutun] = "*";
            }
            else{
                i--;
            }
        }
        return bombPanel;
    }
    void startGame(String[][] panel,String[][] bombPanel) {

        do {
            int count = 0;

            write(panel);
            System.out.print("Please enter a row : ");
            int gsatir = scn.nextInt();
            System.out.print("Please enter a column  : ");
            int gsutun = scn.nextInt();
            if (gsatir<satir && gsutun< sutun && gsatir>=0 && gsutun>=0) {
                if (bombPanel[gsatir][gsutun].equals("*")) {
                    System.out.println( "You have stepped on the sweep game over ! ");
                    for (int i = 0; i < panel.length; i++) {
                        for (int j = 0; j < panel[i].length; j++) {
                            if (bombPanel[i][j].equals("*")) {
                                panel[i][j] = "*";
                            }
                        }
                    }
                    write(panel);

                    this.control = false;
                } else {
                    gameCounter++;
                    if (gsutun > 0 && (bombPanel[gsatir][gsutun - 1].equals("*"))) count++;
                    if (gsutun < bombPanel.length - 1 && (bombPanel[gsatir][gsutun + 1].equals("*"))) count++;
                    if (gsatir > 0 && (bombPanel[gsatir - 1][gsutun].equals("*"))) count++;
                    if (gsatir < bombPanel.length - 1 && (bombPanel[gsatir + 1][gsutun].equals("*"))) count++;
                    panel[gsatir][gsutun] = String.valueOf(count);

                }
            }
            else {
                System.out.println("==============================");
                System.out.println("    Please enter a valid location !");
            }
        }while ((this.satir*this.sutun)-((this.satir*this.sutun)/4)>gameCounter && control);

        if (gameCounter==(this.satir*this.sutun)-((this.satir*this.sutun)/4)){
            System.out.println("Congratulations...");
            for (int i= 0 ; i<panel.length;i++){
                for (int j = 0 ; j<panel[i].length;j++){
                    if (bombPanel[i][j].equals("*")){
                        panel[i][j] = "*";
                    }
                }
            }
            write(panel);
            this.control=false;
        }

    }
}
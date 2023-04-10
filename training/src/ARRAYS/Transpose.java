package ARRAYS;
import java.util.*;
public class Transpose {

    static  void display(int[][] array){
        for (int[] row:array){
            for (int column:row){
                System.out.print(column+"\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int row=2,column=3;
        int[][] array={{11,2,1},{5,7,8}};

        display(array);


        int[][] transpose=new int[column][row];
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array[i].length;j++){
                transpose[j][i]=array[i][j];
            }
        }
        display(transpose);


    }
}

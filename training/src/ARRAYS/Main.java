package ARRAYS;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] row={1,2,3,4,5,6,7,8,9,10};
        float sum=0.f;


        for (int i=0;i<row.length;i++){
            double harm=1.0/row[i];
            sum+=harm;
        }
        System.out.println(sum);

    }
}

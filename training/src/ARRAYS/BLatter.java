package ARRAYS;

public class BLatter {
    public static void main(String[] args) {
        String[][] latter=new String[5][6];
        for (int i=0;i<latter.length;i++){
            for (int j=0;j<latter[i].length;j++){
                if (i==0||i==2||i==4){
                    latter[i][j]="*";
                }
                else if (j==0||j==5){
                    latter[i][j]="*";
                }
                else {
                    latter[i][j]=" ";
                }
            }
        }
        for (String[] row:latter){
            for (String col:row){
                System.out.print(col);
            }
            System.out.println();
        }

    }
}

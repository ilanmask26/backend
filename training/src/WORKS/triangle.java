package WORKS;
import java.util.Scanner;
public class triangle {
    public static void main(String[] args) {
        /*to calculate area of triangles
         2u= edge_ab+edge_bc+edge_ac => u=(edge_ab+edge_bc+edge_ac )/2
         area=sqrt(u*(u-edge_ab)*(u-edge_bc)*(u-edge_ac))

        */
        double edge_ab,edge_bc,edge_ac, area,u;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the edge of ab: ");
        edge_ab=input.nextDouble();

        System.out.print("Enter the edge of bc: ");
        edge_bc=input.nextDouble();

        System.out.print("Enter the edge of ac: ");
        edge_ac=input.nextDouble();

        u=(edge_ab+edge_ac+edge_bc)/2;
        area=Math.sqrt(u*(u-edge_ab)*(u-edge_bc)*(u-edge_ac));
        System.out.println("your area is: "+area);








    }
}

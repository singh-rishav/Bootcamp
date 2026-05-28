//Difference of diagonal elements of a Matrix



import java.util.Scanner; 

public class Matrixdiagonaldifference {
public static void main(String[] args){
    int rows,cols;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter number of rows: ");
    rows=sc.nextInt();
    System.out.print("Enter number of columns: ");
    cols=sc.nextInt();
    int matrix[][]=new int[rows][cols];
    for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
matrix[i][j]=sc.nextInt();
        }
    }
   for(int i=0;i<rows;i++){
    for(int j=0;j<cols;j++){
        System.out.print(matrix[i][j]+" ");
    }
    System.out.println();
}
 int pdiag=0,sdiag=0;
 for(int i=0;i<rows;i++){
    pdiag+=matrix[i][i];
    sdiag+=matrix[i][rows-1-i];
 }
 int diff=pdiag-sdiag;
 System.out.print("Difference of diagonal elements= "+diff);
 sc.close();
}    
}

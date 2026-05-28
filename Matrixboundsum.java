//Sum of boundary element of Matrix.

import java.util.Scanner;

public class Matrixboundsum {
    public static void main(String[] args){
        int rows,cols,sum=0;
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
        System.out.println("The Matrix :");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.print("Sum of boundary elements = ");
for(int i=0;i<rows;i++){
    for(int j=0;j<cols;j++){
        if(i==0||i==rows-1||j==0||j==cols-1){
            sum=sum+matrix[i][j];
          
        }
    }
      System.out.println(sum);
}
sc.close();
    }
}

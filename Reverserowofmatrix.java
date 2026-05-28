import java.util.Scanner;

public class Reverserowofmatrix {
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
 System.out.println("The Matrix: ");
 for(int i=0;i<rows;i++){
    for(int j=0;j<cols;j++){
System.out.print(matrix[i][j]+" ");
    }
    System.out.println();
 }
 System.out.println();;
 for(int i=0;i<rows;i++){
for(int j=0;j<cols/2;j++){
int temp=matrix[i][j];
matrix[i][j]=matrix[i][cols-1-j];
matrix[i][cols-1-j]=temp;
}
}
for(int i=0;i<rows;i++){
    for(int j=0;j<cols;j++){
        System.out.print(matrix[i][j]+" ");
    }
    System.out.println();
}
sc.close();
 }
    }


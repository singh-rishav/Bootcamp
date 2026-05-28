//Finding the smallest and largest element in an array.


import java.util.Scanner;

public class Arrayminmax{
    public static void main(String[] args){
        int n;
Scanner sc=new Scanner(System.in);
System.out.print("Enter size of array: ");
 n=sc.nextInt();
int arr[]=new int [n];
System.out.println("Enter elements of array: ");
for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();

}
int min=arr[0];
int max=arr[0];
    
for(int i=1;i<n;i++){
    if(arr[i]<min){
        min=arr[i];
    }
    if(arr[i]>max);
    max=arr[i];
}

System.out.println("Smallest element : "+min);
System.out.println("Largest element : "+max);

sc.close();
    }
}


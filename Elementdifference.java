//Finding the difference between the first and last element of array.


import java.util.Scanner;
public class Elementdifference {
    public static void main(String[] args){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
    n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    System.out.print("array: ");
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();

    if(n>0){
        int min=arr[0];
        int max=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        int diff=max-min;
        System.out.print("Difference between max and min element = "+diff);
    }else{
        System.out.println("Empty Array.");
    }
    sc.close();
    }
}

//Deleting the smallest element in Array.


import java.util.Scanner;

public class Arraydelsmallelement{
    public static void main(String[] args){
        int n,min,index;
        System.out.println("Enter size of array:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        min=arr[0];
        index=0;

        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
                index=i;
            }
            int newarr[]=new int[n-1];
            int j=0;

            for(i=0;i<n-1;i++){
                if(i==index){
                    continue;
                }
                newarr[j]=arr[i];
                j++;
            }
            System.out.println("New array after deletion: ");
            for( i=0;i<n;i++){
                System.out.println(newarr[i]+" ");
            }
            sc.close();
        }

    }
}
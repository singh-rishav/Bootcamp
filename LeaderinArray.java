//Printing the leader elements.



import java.util.Scanner;

public class LeaderinArray {
    public static void main(String[] args){
        int n;
        System.out.print("Enter size  of Array: ");
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();

        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       int cmax=arr[n-1];
       System.out.print("Rightmost Leader element: "+cmax);
      System.out.println();
        for(int i=n-2;i>=0;i--){
            if(arr[i]>cmax){
                cmax=arr[i];
                System.out.println("Leader Element = "+cmax);
            }}
            System.out.println();
                sc.close();
}
    }


import java.util.*;
public class pairs{
    public static void reversearray(int arr[]){
        int total_pairs = 0;
        for(int i=0;i<arr.length;i++){
            // int curr = arr[i]; //2,4,6,8,10
            for(int j=i+1;j<arr.length;j++){
                System.out.print("(" + arr[i] + "," + arr[j] + ")");
                total_pairs++;
            }
            System.out.println();
        }
        System.out.println("Total pairs are: "+total_pairs);

       
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int arr[] = {2,4,6,8,10};
        reversearray(arr);
        
       
        
    }
}
import java.util.*;
public class subarray{
    public static void subarray(int arr[]){
        int total= 0;
        for(int i=0;i<arr.length;i++){
            int start = i;
            for(int j=i;j<arr.length;j++){  // One Set of Arrays
                int end = j;
                int sum = 0;
                for(int k = start;k<=end;k++){      //print
                    System.out.print(arr[k] +" ");        //subarray
                    sum += arr[k];
                }
                System.out.print("sum:"+sum);
                total++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subarrays are: "+total);
       
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int arr[] = {2,4,6,8,10};
        subarray(arr);
        
       
        
    }
}
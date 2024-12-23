import java.util.*;

// BRUTE FORCE

public class maxsubarraysum{
    public static void pairs(int arr[]){
        int tp = 0;
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum =0;
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                    sum += arr[k];
                    if(sum > largest){
                        largest = sum;
                    }
                    if(sum < smallest){
                        smallest = sum;
                    }
                }
                tp++;
                System.out.println();
                System.out.println("sum of subarrays is:"+sum);
            } 
            System.out.println();
        }
        System.out.println("total pairs:"+tp);
        System.out.println("largest sum in the array is:" + largest);
        System.out.println("smallest sum in the array is:" + smallest);
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);

        int arr[] = {1,-2,6,-1,3};

        pairs(arr);
    }
}
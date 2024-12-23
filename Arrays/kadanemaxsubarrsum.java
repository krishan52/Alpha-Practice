import java.util.*;
public class kadanemaxsubarrsum{
    public static void kadanesum(int arr[]){
       int ms = Integer.MIN_VALUE;
       int cs = 0;
       for(int i=0;i<arr.length;i++){
        cs = cs + arr[i];
        if(cs < 0){
            cs = 0;
        }
        ms = Math.max(cs,ms);
       }
       System.out.println("Max subarray sum is:"+ms);
       
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        kadanesum(arr);
    }
}
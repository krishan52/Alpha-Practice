import java.util.*;
public class maxsubarraysum1{
    public static void subarray(int arr[]){
        int total= 0;
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int start = i;
            for(int j=i;j<arr.length;j++){  // One Set of Arrays
                int end = j;
                currsum = 0;
                for(int k = start;k<=end;k++){      //print
                    // sum of sub-array
                    currsum += arr[k]; 
                }
                System.out.println("Current Sum:"+currsum);
                if(maxsum < currsum){
                    maxsum = currsum;
                }

            }
        }
        System.out.println("Maximum sum of the sub-arrays is: "+maxsum);
       
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int arr[] = {1,-2,6,-1,3};
        subarray(arr);
        
       
        
    }
}
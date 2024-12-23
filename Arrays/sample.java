import java.util.*;

public class sample{
   public static void subArrays(int arr[]){
    for(int i = 0;i<arr.length;i++){
        int start = i;
        for(int j=i;j<arr.length;j++){
            int end = j;
            for(int k=arr[j];k<=arr.length;k++){        // print
                System.out.println(arr[k]+" ");
            }
            System.out.pritln();
        }
        System.out.println();
    }
   
   }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int arr[] = {2,4,6,8,10};
        subArrays(arr);
    }
}
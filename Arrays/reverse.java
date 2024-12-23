import java.util.*;
public class reverse{
    public static void reversearray(int arr[]){
        int first = 0, last = arr.length-1;

        while(first < last){
            // swap
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;
            first++;
            last--;
        }
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int arr[] = {2,4,6,8,10};
        reversearray(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
    }
}
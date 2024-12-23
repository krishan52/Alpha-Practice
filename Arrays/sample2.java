import java.util.*;

public class sample2{
    public static void reverse(int arr[]){
    for(int i=arr.length - 1;i>=0;i--){
        System.out.print(arr[i]+" ");
    }
        System.out.println();
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int arr[] = {2,4,6,8,10,12,14};
        reverse(arr);
        
}
}
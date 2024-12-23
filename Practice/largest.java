import java.util.*;
public class largest{
public static int largest(int arr[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
        if(arr[i] > largest){
            largest = arr[i];
        }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }
        System.out.println("Smallest element is:"+smallest);
        return largest;
    }
    public static void main(String args[]){
    Scanner scn = new Scanner(System.in);
    int arr[] = {1,2,6,3,5};
    System.out.println("Largest number in the array is:" + largest(arr));
}
}
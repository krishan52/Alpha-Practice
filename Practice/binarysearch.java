import java.util.*;

public class binarysearch{
    public static int binary(int arr[],int key){
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            int mid = (start + end)/2;
            if(key == arr[mid]){
                return mid;
            }
            else if(key > arr[mid]){
                start = mid + 1;
            }
            else{
                end = mid -1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int arr[] = {2,4,6,8,10,12,14};
        System.out.println("Enter your key that you want to search:");
        int key = scn.nextInt();
        int index = binary(arr,key);
        if(index == -1){
            System.out.println("key not found!");
        } else {
            System.out.println("your key is at index:" + index);
        }

    }
}
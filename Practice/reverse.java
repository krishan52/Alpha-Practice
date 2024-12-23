import java.util.*;

public class reverse{
    public static void reversearr(int arr[]){
        int start = 0;
        int end = arr.length -1;
        // for(int i=start;i<=end;i++){
        //     int temp = 0;
        //     temp = arr[start];
        //     arr[start] = arr[end];
        //     arr[end] = temp;
        //     start++;
        //     end--;
        // }
        // or
        while(start < end) {
            int temp = 0;
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int arr[] = {2,4,6,8,10};

        reversearr(arr);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
}
import java.util.*;

public class hi{
    public static void update(int arr[], int cons){
       for(int i=0;i<arr.length;i++){
        arr[i] = arr[i] + 1;
       }
       cons = 94;
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        // System.out.println("hello world");

        // int arr[] = new int[50];
        // // arr[0] = 45;
        // // arr[1] = 98;
        // for(int i=0;i<3;i++){
        //     System.out.println("Enter your input:");
        //     arr[i] = scn.nextInt();
        // }
        // System.out.println(arr[0]);
        // System.out.println(arr[1]);
        // System.out.println(arr[2]);

        // Next Code
        int arr[] = {97,98,99};
        int cons = 92;
        update(arr,cons);

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println(cons);


    }
}
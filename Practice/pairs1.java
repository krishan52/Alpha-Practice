import java.util.*;

public class pairs1{
    public static void pairs(int arr[]){
        int tp = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                tp++;
                System.out.println();
            } 
            System.out.println();
        }
        System.out.println("total pairs:"+tp);
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);

        int arr[] = {2,4,6,8,10};

        pairs(arr);
    }
}
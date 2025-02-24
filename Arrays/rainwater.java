import java.util.*;
public class rainwater{
    public static int trappedwater(int height[]){
        int n = height.length;
        // Calculate left max boundary - array
        int leftMax[] = new int[n];
        leftMax[0] = 0;
        for(int i = 1;i<n;i++){
            leftMax[i] = Math.max(height[i],leftMax[i-1]);
        }

        // Calculate right max boundary - array
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i = n-2;i>=0;i--){
            rightMax[i] = Math.max(height[i],rightMax[i+1]);
        }

        int trappedWater = 0;
        // loop
        for(int i =0;i<n;i++){
             // water level = min(leftmax  boundary, rightmax boundary)
           int waterlevel = Math.min(leftMax[i],rightMax[i]);
           // trapped water = waterlevel - height[i]
           trappedWater += waterlevel - height[i];
        }
       
        return trappedWater;
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int height[] ={4, 2, 0, 6, 3, 2, 5};
        System.out.println("Maximum rainwater is:"+trappedwater(height));

    }
}


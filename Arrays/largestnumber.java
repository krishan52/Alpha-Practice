import java.util.*;
public class largestnumber{
    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;          // -infinity
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(largest<numbers[i]){
                largest = numbers[i];
            }
        }
        for(int i=0;i<numbers.length;i++){
            if(smallest>numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("The smallest element in the array is: " + smallest);
        return largest;
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int numbers[] = {1,2,6,3,5};
        System.out.println("The greatest array is: "+getLargest(numbers));
    }
}
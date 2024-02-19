import java.util.*;
public class sample{
    public static int getLargest(int numbers[]){
        int largest = INTEGER.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(largest<numbers[i]){
                largest = numbers[i];
            }
        }
        return largest;

    }
    public static void main(String args[]);
    Scanner scn = new Scanner(System.in);
    int numbers[]={1,2,3,4,5,6};
    System.out.println(getLargest(numbers));

    
}
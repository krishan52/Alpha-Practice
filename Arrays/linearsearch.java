import java.util.*;
public class linearsearch{
    public static int linear(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int numbers[] = {2,4,6,8,10,12,14,16};
        System.out.println("Enter your key:");
        int key = scn.nextInt();
        int index = linear(numbers,key);
        if(index == -1){
            System.out.println("NOT FOUND!");
        }
        else{
            System.out.println("key is at index: "+index);
        }
        
    }
}
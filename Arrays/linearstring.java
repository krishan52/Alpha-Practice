import java.util.*;
public class linearsearch{
    public static String linear(String numbers[],int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int dishes[] = {"samosa","pepsi","coke","jalebi","burger","momo"};
        System.out.println("Enter your dish:");
        String key = scn.nextString();
        String index = linear(dishes,key);
        if(){
            System.out.println("NOT FOUND!");
        }
        else{
            System.out.println("your dish is at counter: "+index);
        }
        
    }
}
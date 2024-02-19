import java.util.*;
public class evenorodd{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your number:");
        int number = scn.nextInt();
        if(number%2==0){
            System.out.println("number is even");
        }
        else{
            System.out.println("number is odd");
        }
    }
}
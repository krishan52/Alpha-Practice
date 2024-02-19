import java.util.*;
public class tenmultiple{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter your number:");
        do{
              
              int n = scn.nextInt();
              if(n % 10==0){ 
                System.out.println("your number is a multiple of 10: "+n);

                break;
              }
              System.out.println("your number is not a multiple of 10: "+n);
              System.out.println("Enter again:");
              
              
        }
        while(true);
    }
}
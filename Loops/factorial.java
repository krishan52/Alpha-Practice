import java.util.*;
public class factorial{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your number:");
        int n = scn.nextInt();
        int i ;
        int multiply = 1 ;
        for(i=1;i<=n;i++){
            multiply = multiply*i; 

        }
        System.out.println("your factorial is: " + multiply);

        
    }
}
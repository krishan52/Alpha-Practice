import java.util.*;
public class naturalnum{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = scn.nextInt();;
        int i = 1;
        int sum = 0;
        while (i<=n){
            sum = sum + i;
            i++;
        }
        System.out.println("Sum of n natural numbers is: "+sum);
       
        
        
    }
}
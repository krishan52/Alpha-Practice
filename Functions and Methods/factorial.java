import java.util.*;
public class factorial{
    public static int factorial(int n){ 
        int count = 1;
        for(int i=1;i<=n;i++){
            count = count * i;
            
        }
        return count;
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your number:");
        int n = scn.nextInt();
        int fact = factorial(n);
        System.out.println("factorial of n is:"+fact);
    }
}
import java.util.*;
public class binomial{
    public static int factorial(int n){ 
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact = fact * i;
            
        }
        return fact;
    }
    public static int binomial(int x,int r){ 
        int fact_n = factorial(x);
        int fact_r = factorial(r);
        int fact_nmr = factorial(x-r);
        int bino = fact_n/(fact_r * fact_nmr);
        return bino;
        
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your number:");
        int n = scn.nextInt();
        System.out.println("Enter r");
        int r = scn.nextInt();
        System.out.println("factorial of n is:"+binomial(n,r));
    }
}
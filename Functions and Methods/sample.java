import java.util.*;
public class sample{
    public static int binomial(int x,int r){ 
        int count = 1;
        for(int i=1;i<=x;i++){
            count = count * i;
            
        }
        int count1 = 1;
        for(int j=1;j<=r;j++){
            count1 = count1 * j;
        }
        int sub = x - r;
        int count2 = 1;
        for(int k=1;k<=sub;k++){
            count2 = count2 * k;
        }
        int bino = count/(count1*count2);
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
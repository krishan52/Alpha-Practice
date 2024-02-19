import java.util.*;
public class sumdigitinint{
    public static int sum(int n){
        int sum=0;
        while(n>0){
            int lastdigit = n%10;
            sum = sum + lastdigit;
            n = n/10;

        }
        return sum;
        
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your number:");
        int n = scn.nextInt();
        System.out.println("sum of your digit in integer is:"+sum(n));
    }
}
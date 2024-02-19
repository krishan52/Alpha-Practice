import java.util.*;
public class prime{
    //only for n>=2
    public static boolean isprime(int n){
        //corner cases
        if(n<2){
            return false;
        }
        if(n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
            
        }
        return true;
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your number:");
        int n = scn.nextInt();
            System.out.println(isprime(n));
        }
}
    

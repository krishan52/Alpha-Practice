import java.util.*;
public class primeinrange{
    public static boolean isprime(int n){
        //corner cases
        // if(n<2){
        //     return false;
        // }
         if(n==2){
            return true;
        }
        else{
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
            
        }
        }
        return true;
    }
    //only for n>=2
    public static void range(int n){
        System.out.println("The prime numbers in range of "+n+" is:");
            for(int i=2;i<=n;i++){
                if(isprime(i)){
                    System.out.print(i+" ");
                }
            }
            System.out.println();
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your number:");
        int n = scn.nextInt();
        range(n);
    }
}
    

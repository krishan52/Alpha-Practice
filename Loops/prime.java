import java.util.*;
public class prime{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int n = scn.nextInt();
        int i;
        boolean isprime=true;
        if(n==2){
            System.out.println("prime");
        }
        else{
        for(i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){     //n is a multiple of i(i!=1&&i!=n)
                isprime=false;
            }
            
        }
        if(n==1){
            System.out.println("not prime");
        }
        else if(isprime==true){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
        }


        
    }
}
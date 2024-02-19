import java.util.*;
public class palindrome{
    public static void oppo(long n){
        long pow = 0;
        long mynum = n;
        long rev = 0;
        while(n>0){
            long rem = n % 10;
            rev = rev + (long)(rem*Math.pow(10,pow));
            pow++;
            n = n / 10;
            

        }
        if(mynum==rev){
            System.out.println("you're given number is palidrome");
            
        }
        else{
                System.out.println("you're given number is not palidrome");
            }
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your number:");
        long n = scn.nextLong();
        oppo(n);
    }
}
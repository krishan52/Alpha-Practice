import java.util.*;
public class dectobin{
    public static void dec(int n){
        int mynum = n;
        int pow = 0;
        int bin = 0;
        System.out.print("you're binary number of "+mynum+" is:");
        while(n>0){
            int rem = n % 2;
            bin = bin + rem*(int)Math.pow(10,pow);
            pow++;
            n = n / 2;

        }
        System.out.print(bin);
        System.out.println();
        
    }
    
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your decimal number:");
        int n = scn.nextInt();
        dec(n);

    }
}
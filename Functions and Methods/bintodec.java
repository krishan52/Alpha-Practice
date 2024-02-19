import java.util.*;
public class bintodec{
    public static void bin(int binnum){
        int mynum = binnum;
        int pow = 0;
        int decnum = 0;
        while(binnum > 0){
            int lastdigit = binnum%10;
            decnum = decnum + (lastdigit * (int) Math.pow(2,pow));
            pow++;
            binnum = binnum / 10;
        }
        System.out.println("decimal of "+mynum+" is:"+decnum);
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your binary number:");
        int n = scn.nextInt();
        bin(n);
    }
}
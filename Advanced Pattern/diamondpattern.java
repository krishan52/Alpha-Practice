import java.util.*;
public class diamondpattern{
    public static void diamond(int n){
        // for upper pyramid
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // for inverted pyramid
         for(int i=n;i>=1;i--){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
        public static void main(String args[]){
            Scanner scn = new Scanner(System.in);
            System.out.println("Enter your row number:");
            int n = scn.nextInt();
            diamond(n);
        }
    }

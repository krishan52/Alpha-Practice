import java.util.*;
public class solidrhombus{
    public static void rhombus(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
          System.out.print("*****");
          System.out.println();
        }
    }
     
    // Another method

    public static void anotherrhombus(int n){
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //stars
           for(int j=1;j<=n;j++){
            System.out.print("*");
           }
          System.out.println();
        }
    }
    
        public static void main(String args[]){
            Scanner scn = new Scanner(System.in);
            System.out.println("Enter your row number:");
            int n = scn.nextInt();
            anotherrhombus(n);
        }
    }

import java.util.*;
public class hollowrhombus{
    public static void rhombus(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            if(i==1||i==5){
                System.out.print("*****");
            }
            else{
                System.out.print("*   *");
            }
            System.out.println();
        }
    }
        // Another Method

        public static void anotherrhombus(int n){
            for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                if(i==1||i==n||j==1||j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
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

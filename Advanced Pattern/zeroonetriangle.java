import java.util.*;
public class zeroonetriangle{
    public static void triangle(int n){

        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                if((i+j)%2==0){             // even
                    System.out.print("1");
                }
                else{                       // odd
                    System.out.print("0");
                }
            }
            System.out.println();
        }

    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your row number:");
        int n = scn.nextInt();
        triangle(n);
    }
}
import java.util.*;
public class inverted{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your number:");
        int n = scn.nextInt();
        for(int i=1;i<=n;i++){
            //one line
            for(int j=1;j<=(n-i+1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
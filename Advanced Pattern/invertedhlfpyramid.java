import java.util.*;
public class invertedhlfpyramid{
    public static void pyramid(int n){
        int mynum = n;
        for(int i=1;i<=mynum;i++){
            for(int j=1;j<=n;j++){
                System.out.print(j+" ");
            }
            System.out.println();
            n--;
        }
    }

    // Another Method
    public static void another_pyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your number:");
        int n = scn.nextInt();
        // pyramid(n);
        another_pyramid(n);

    }
}
+
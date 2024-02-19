import java.util.*;
public class iseven{
    public static boolean iseven(int n){
            if(n%2==0){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your number:");
        int n = scn.nextInt();
        System.out.println(iseven(n));
        
    }
}
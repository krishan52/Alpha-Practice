import java.util.*;
public class printn{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = scn.nextInt();
        int i = 1;
        while(i<=n){
            System.out.println(i);
            i++;
        }
        
        
    }
}
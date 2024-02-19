import java.util.*;
public class largestof3{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your numbers a,b,c:");
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        
        if(a>b){
            if(a>c){
                System.out.println("a is largest");
            }
        }
        else if(b>c){
            System.out.println("b is largest");
        }
        else{
            System.out.println("c is largest");
        }
    }
}
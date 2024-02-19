import java.util.*;
public class product{
    public static int product(int a,int b){
        int product = a * b;
        return product;
        

    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a and b:");
        int a = scn.nextInt();
        int b = scn.nextInt();
        int multiply = product(a,b);
        System.out.println("product of a and b is:"+multiply);
       
    }
}
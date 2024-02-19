import java.util.*;
public class swapn{
    public static void swapnum(int a,int b){        
        int temp = a;
        a = b;
        b = temp;
        return ;
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        //swap two numbers using call by value
        System.out.println("Enter a and b:");
        int a = scn.nextInt();
        int b = scn.nextInt();
        swapnum(a,b);
        System.out.println("swapped values of a and b is:"+a+b);

       

    }
}
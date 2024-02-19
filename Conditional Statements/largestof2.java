import java.util.*;
public class largestof2{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your numbers:");
        int a = scn.nextInt();
        int b = scn.nextInt();
        if(a>b){
            System.out.println("a is greater");
        }
        else{
            System.out.println("b is greater");
        }
    }
}
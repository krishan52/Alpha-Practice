import java.util.*;
public class overload{
    public static int product(int x,int y){
        int multiply = x * y;
        return multiply;
    }
    public static int product(int x,int y,int z){
        int multiply = x * y *z;
        return multiply;
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your numbers:");
        int x = scn.nextInt();
        int y = scn.nextInt();
        int z = scn.nextInt();
        System.out.println(product(x,y,z));
    }
}
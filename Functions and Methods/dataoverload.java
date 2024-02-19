import java.util.*;
public class dataoverload{
    public static int product(int x,int y){
        int multiply = (int) x * y;
        return multiply;
    }
    public static float product(float x,float y){
        float multiply = x* y;
        return multiply;
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your numbers:");
        int x = scn.nextInt();
        int y = scn.nextInt();
        System.out.println(product(x,y));
        System.out.println(product(x,y));
    }
}
import java.util.*;
public class circlearea{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        float r,area;
        System.out.println("Enter you radius:");
        r = scn.nextFloat();
        area = 3.14f * r * r;
        System.out.println("Area of Cirlce"+area);    
        
    }
}

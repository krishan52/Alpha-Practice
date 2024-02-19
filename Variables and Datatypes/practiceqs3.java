import java.util.*;
public class practiceqs3{
    public static void main(String args[]){
        Scanner scn = new Scanner (System.in);
        System.out.print("Enter price of a pencil:");
        float a = scn.nextFloat();
        System.out.print("Enter price of a pen:");
        float b =  scn.nextFloat();
        System.out.print("Enter price of a eraser:");
        float c =  scn.nextFloat();
        float total_cost = (a + b + c ); 
        System.out.println("total cost is:"+total_cost);
        float new_cost = total_cost + (total_cost * 0.18f);
        System.out.println("total cost after 18% GST:" + new_cost);
    }
}
/* Hi, this is written on 18 Jan,2024
*/
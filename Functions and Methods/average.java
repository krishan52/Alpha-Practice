import java.util.*;
public class average{
    public static int avrg(int a,int b,int c){
        int avg = (a+b+c)/3;
        return avg;
        }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = scn.nextInt();
        System.out.println("Enter b:");
        int b = scn.nextInt();
        System.out.println("Enter c:");
        int c = scn.nextInt();
        System.out.print("The average of three numbers is: "+avrg(a,b,c));
        
        


    }
}
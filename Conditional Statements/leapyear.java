import java.util.*;
public class leapyear{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter year:");
        int year= scn.nextInt();
        if(year%4==0){
            System.out.println("leap year");
        }
        else {
            System.out.println("not a leap year");
        }
        
    }
}
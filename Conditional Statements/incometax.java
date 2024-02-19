import java.util.*;
public class incometax{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your income:");
        int income;
        int tax;
        income = scn.nextInt();
        if(income<500000){
            System.out.println("your tax is :"+(income*0)/100);
        }
        else if(500000<=income && income<=1000000){
            System.out.println("your tax is :"+(income*20)/100);
        }
        else{
            System.out.println("your tax is :"+(income*30)/100);
        }
    }
}
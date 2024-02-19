import java.util.*;
public class switchresult{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your marks:");
        int marks = scn.nextInt();
        int percent = marks; //for one subject
        String result;
        if(percent>=33){
            result = "PASS";
        }
        else{
            result = "FAIL";
        }
        switch(result){
            case "PASS" : System.out.println("you get an award");
            break;
            case "FAIL" : System.out.println("better luck next time");
            break;
            default: System.out.println("Invalid Input");
        }
    }
}
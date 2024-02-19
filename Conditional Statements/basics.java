import java.util.*;
public class basics{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = scn.nextInt();
        if(age>=18){
            System.out.println("you can vote.");
        }
        else{
            System.out.println("you can't vote");
        }
    }
}
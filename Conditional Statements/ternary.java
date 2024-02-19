import java.util.*;
public class ternary{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age;
        age = scn.nextInt();
        String answer = (age>=18)?"you can drive" : "you cann't drive";
        System.out.println(answer);
    }
}
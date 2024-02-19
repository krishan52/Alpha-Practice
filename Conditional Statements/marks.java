import java.util.*;
public class marks{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your marks:");
        int marks;
        marks = scn.nextInt();
        String result = (marks>=33)?"PASS" : "FAIL";
        System.out.println(result);
    }
}
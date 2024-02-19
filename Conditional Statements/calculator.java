import java.util.*;
public class calculator{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = scn.nextInt();
        System.out.println("Enter b:");
        int b = scn.nextInt();
        System.out.println("Enter your operation(+,-,*,/,%):");
        String opt = scn.next();
        switch(opt){
            case "+" : System.out.println("your addition is : "+(a+b));
            break;
            case "-" : System.out.println("your subtraction is: "+(a-b));
            break;
            case "*" : System.out.println("your multiplication is : "+(a*b));
            break;
            case "/" : System.out.println("your division is: "+(a+b));
            break;
            case "%" : System.out.println("your remainder is: "+(a%b));
            break;
            default: System.out.println("Invalid operation");
        }
    }
}
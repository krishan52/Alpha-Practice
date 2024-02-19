import java.util.*;
public class sumf{
    public static int calculatesum(int n1,int n2){
        int sum = n1 + n2;
        return sum;
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a and b:");
        int a = scn.nextInt();
        int b = scn.nextInt();
        int sum = calculatesum(a,b);
        System.out.println("Sum is: "+sum);

    }
}
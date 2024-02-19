import java.util.*;
public class opposite{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your number:");
        int n = scn.nextInt();
        while(n>0){
            int lastdigit = n%10;
             System.out.print(lastdigit+"");
             n/=10;


        }
        System.out.println();
       

    }
}
import java.util.*;
public class givenopposite{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your number:");
        int n = scn.nextInt();
        int rev=0;
        while(n>0){
            int lastdigit = n%10;
             n/=10;
             rev = (rev*10)+lastdigit;
             

        }
        System.out.println(rev);
       

    }
}
import java.util.*;
public class whileevenoddsum{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int evensum=0;
        int oddsum=0;
        while(true){
            System.out.println("Enter your interger:");
            int n = scn.nextInt();
            if(n%2==0){
                evensum = evensum + n;
            }
            else{
                oddsum = oddsum + n;
            }
            System.out.println("Type 'true' to continue and 'false' to exit.");
            boolean choice = scn.nextBoolean();
            if(choice==true){
                continue;
            }
               else{
                break;
            }
        }
        System.out.println("the sum of even numbers are: "+ evensum);
        System.out.println("the sum of odd numbers are: "+ oddsum);


        
    }
}


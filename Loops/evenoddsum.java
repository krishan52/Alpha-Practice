import java.util.*;
public class evenoddsum{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int evensum=0;
        int oddsum=0;

        do{  
            System.out.println("Enter your interger:");
            int n = scn.nextInt();
            if(n%2==0){
                evensum = evensum + n ;
            }
            else{
                oddsum = oddsum + n;
            }
            System.out.println("Do you want to continue(true or false)");
            boolean option = scn.nextBoolean();
            if(option==true){
                continue;
            }
            else{
                break;
            }

        } while(true);
        System.out.println("the sum of even numbers are: "+ evensum);
        System.out.println("the sum of even numbers are: "+ oddsum);

    }
}
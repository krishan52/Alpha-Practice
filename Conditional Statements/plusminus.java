import java.util.*;
public class plusminus{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter N:");
        int N = scn.nextInt();
        if(N>=0){
            System.out.println("POSITIVE");
        }
        else{
            System.out.println("NEGATIVE");
        }
    }
}
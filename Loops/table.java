import java.util.*;
public class table{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your number:");
        int n = scn.nextInt();
        int i;
        int table = 0;
        for(i=1;i<=10;i++){
            table = n * i;
            System.out.println(table);
        }

        
    }
}
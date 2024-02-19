import java.util.*;
public class continuecheck{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int i=10;
        do{ 
            if(i==4){
                continue;
            }
            System.out.print(i+" ");
            i--;
            
        }
        while(i>=0);
        System.out.println();
    }
}
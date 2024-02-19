import java.util.*;
public class forcontinue{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int i;
        for(i=10;i>=0;i--){
            if(i==5){
                continue;
            }
            System.out.print(i+" ");
        }

        System.out.println();
    }
}
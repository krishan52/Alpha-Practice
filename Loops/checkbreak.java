import java.util.*;
public class checkbreak{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int i=10;
        do{ 
            if(i==5){
                break;
            }
            System.out.print(i+" ");
            i--;
        }
        while(i>0);
        System.out.println();
    }
}
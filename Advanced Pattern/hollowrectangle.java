import java.util.*;
public class hollowrectangle{
    public static void rectangle(int totalrows,int totalcolumns){
        for(int i=1;i<=totalrows;i++){
            for(int j=1;j<=totalcolumns;j++){
                if(i==1||i==totalrows||j==1||j==totalcolumns){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }    
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter total number of rows:");
        int rows = scn.nextInt();
        System.out.println("Enter total number of columns:");
        int columns = scn.nextInt();
        rectangle(rows,columns);

    }
}
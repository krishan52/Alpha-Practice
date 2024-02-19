import java.util.*;
public class arrasfunction{
    public static void update(int marks[],int nonchangeable){
        nonchangeable = 23;
        for(int i=0;i<marks.length;i++){
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in); 
        int marks[] = {98,97,96};
        int nonchangeable = 3;
        System.out.println(nonchangeable);
        update(marks,nonchangeable);

        // print our marks 
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]+" ");
        }
        System.out.println(); 
    }
}
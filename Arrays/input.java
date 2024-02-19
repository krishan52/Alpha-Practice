import java.util.*;
public class input{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int marks[] = new int[100];
        System.out.print("Enter your Physics marks:");       // Physics
        marks[0] = scn.nextInt();    
        System.out.print("Enter your Chemistry marks:");      // Chemistry
        marks[1] = scn.nextInt();    
        System.out.print("Enter your Maths marks:");      // Maths
        marks[2] = scn.nextInt();       
        System.out.println("physics:"+marks[0]);
        System.out.println("chemistry:"+marks[1]);
        System.out.println("maths:"+marks[2]);
        // marks[0]+=5;
        // System.out.println("physics:"+marks[0]);
        int percentage = (marks[0]+marks[1]+marks[2])/3;
        System.out.println("your percentage is : "+ percentage+"%");
        System.out.println(marks.length);


    }
}
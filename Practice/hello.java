import java.util.*;
public class hello{
public static int linears(String menu[] , String key){
        for(int i=0;i<menu.length;i++){
            if(menu[i].equals(key)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
    Scanner scn = new Scanner(System.in);
    String menu[] = {"samosa","coke","pepsi","namkeen"};
    System.out.println("Enter your String that you want to search:");
    String key = scn.nextLine();
    int index = linears(menu,key);
    if(index == -1){
        System.out.println("NOT FOUND!");
    }
    else{
        System.out.println("your key is found at index:" + index);
    }
}
}
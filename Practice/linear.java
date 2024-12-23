import java.util.*;

public class linear{
    public static int linearsearch(int arr[],int key){
       for(int i=0;i<arr.length;i++){
        if(arr[i] == key){
            return i;
        }
       }
       return -1;
    }
    public static String linears(String menu[] , int key){
        for(int i=0;i<menu.length;i++){
            if(menu[i] == key){
                return "found";
            }
        }
        return "not found";
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        // int arr[] = {2,4,6,8,10,12,14,16};
        // System.out.println("Enter the key you want to search:");
        // int key = scn.nextInt();
        // int result = linearsearch(arr,key);
        // if(result == -1){
        //     System.out.println("NOT FOUND!");
        // } else {
        //     System.out.println("your key is at index:"+result);
        // }

        String menu[] = {"samosa","coke","pepsi"};
        System.out.println("Enter your String that you want to search:");
        String key = scn.nextLine();
        
       System.out.print(linears(menu,key));

    }
}
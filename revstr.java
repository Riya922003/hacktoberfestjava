import java.util.*;

public class revstr{
    public static void main(String args[]){
        String str = "Hello World";
        char[] arr = str.toCharArray();
        char[] temp = new char[str.length()];
        int i=0;
        int j=str.length()-1;
        for(;i<j;i++,j--){
            arr[i]=arr[j];
        } 
        System.out.println(arr);
    }
}
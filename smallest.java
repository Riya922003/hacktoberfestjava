import java.util.*;
public class smallest{
    
    private static int great(int a[]){
        int min = a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        return min;
    }

    public static void main(String args[]){
      int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int res=great(a);
        System.out.println("Min Value: "+res);
    }
}
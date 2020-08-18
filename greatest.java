import java.util.*;
public class greatest{
    
    private static int great(int a[]){
        int max = a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        return max;
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
        System.out.println("Max Value: "+res);
    }
}
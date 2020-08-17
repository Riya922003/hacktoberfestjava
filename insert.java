import java.util.*;
public class insert{
     public static void main(String args[]){
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+"\t");
        }
        System.out.println();

        //Insertion Sort
        for(int i=0;i<n;i++){
            int temp=a[i];
            int j=i;
            while(j>0 && a[j-1]>a[i]){
                a[j]=a[j-1];
                j--;
            }
            a[j]=temp;
                    for(int i=0;i<n;i++){
            System.out.print(a[i]+"\t");
        }
        System.out.println();
            
        }

     }
}
import java.util.*;
public class mean{
    private static double mean(int a[]){
        int sum=0;
        try{
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        }
        catch(Exception e){
            System.out.println("Fuck off");
        }
        return sum/a.length;
    }
    private static void median(int a[]){
        int x=a.length;
        int mid=x/2;
        if(x%2==0){
            double avg = (a[mid]+a[mid+1])/2;
            System.out.println(avg);
        }
        else{
            System.out.println(a[mid]);
        }
    }
    public static void main(String args[]){
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){

                a[i] = sc.nextInt();      
            
        }
        System.out.println(mean(a));
        Arrays.sort(a);
        median(a);


    }
}
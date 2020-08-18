import java.lang.*;
public class sumofpowers{
    static int sum=0;
    public static void main(String args[]){
        for(int i=1;i<=3;i++){
            sum+= Math.pow(i,i);
        }
        System.out.println(sum);
    }
}
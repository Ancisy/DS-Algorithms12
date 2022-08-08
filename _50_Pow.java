import java.math.BigDecimal;

public class Solution {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(myPow(2,-88));
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }

    public static double myPow(double x, int n) {
        int l = 0 ;
        if(n==0)
            return 1;

        if(n<0){
            if(n%2==0){
                l = -(n/2); //Integer max: 2^31-1
            }else{
                l = (-n-1)/2;
            }
            x = 1/x;
        }else{
            if(n%2==0){
                l = n/2;
            }else{
                l = (n-1)/2;
            }
        }
        double temp = myPow(x,l);
        if(n%2==0){
            return temp*temp;
        }else {
            return x*temp*temp;
        }

    }
}

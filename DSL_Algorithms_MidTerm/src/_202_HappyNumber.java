public class _202_HappyNumber {
    public static void main(String[] args) {
        System.out.println(isHappy(7));
    }

    public static boolean isHappy(int n) {
        boolean status = false;
        while (n>7) {
            n = powCalculate(n);;
        }
        if(n == 1 || n ==7){
            status = true;
        }
        return status;
    }


    public static int powCalculate(int n) {
        int powResult = 0;
        while (n > 0) {
            if(n>=10)
            powResult += (n % 10) * (n % 10);
            else{
                powResult += (n)*(n);
            }
            n = n / 10;
        }
        return powResult;
    }
}

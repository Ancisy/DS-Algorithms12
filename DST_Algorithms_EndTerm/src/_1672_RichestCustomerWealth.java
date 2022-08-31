public class _1672_RichestCustomerWealth {
    public static void main(String[] args) {

    }

    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        int sum = 0;
        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[0].length; j++) {
                sum += accounts[i][j];
            }
            if (sum > maxWealth)
                maxWealth = sum;
            sum = 0;
        }
        return maxWealth;
    }

}

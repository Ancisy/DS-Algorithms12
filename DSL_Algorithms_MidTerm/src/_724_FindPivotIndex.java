public class _724_FindPivotIndex {
    public static void main(String[] args) {

    }

    public int pivotIndex(int[] nums) {
        int Sum = 0;
        int leftSum = 0;
        int rightSum = 0;
        for(int i = 0 ; i<nums.length; i++){
            Sum += nums[i];
        }

        for(int i = 0; i <nums.length; i++){
            rightSum = Sum - leftSum - nums[i];
            if(rightSum == leftSum){
                return i;
            }
            leftSum +=nums[i];
        }
        return -1;
    }
}

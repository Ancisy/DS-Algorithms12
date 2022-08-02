public class _905_SortArrayByParity {
    public static void main(String[] args) {
            int[] nums= {3,1,2,4};
            nums = sortArrayByParity(nums);
            for(int i : nums){
                System.out.println(i);
            }
    }

    public static int[] sortArrayByParity(int[] nums) {
        int sPoint=0;
        int ePoint=nums.length-1;
        int temp = 0;
        while(sPoint<ePoint){
            if(nums[sPoint]%2==0 && nums[ePoint]%2==0){
                sPoint++;
            }

            if(nums[sPoint]%2!=0 && nums[ePoint]%2!=0){
                ePoint--;
            }

            if(nums[sPoint]%2==0 && nums[ePoint]%2!=0){
                ePoint--;
            }

            if(nums[sPoint]%2!=0 && nums[ePoint]%2==0){
                temp = nums[ePoint];
                nums[ePoint] = nums[sPoint];
                nums[sPoint] = temp;
                ePoint--;
                sPoint++;
            }

        }
        return nums;
    }
}

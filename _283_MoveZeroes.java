public class _283_MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {0, 1};
        int[] newArr = moveZeroes(nums);
        for (int i : newArr) {
            System.out.println(i);
        }
    }

    public static int[] moveZeroes(int[] nums) {

        //Do this in-place
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }
        for (int i = j; i < nums.length; i++) {
            nums[i] = 0;
        }
        return nums;

        //Use copy of the array
//        int m = nums.length-1;
//        int[] cloneArr = new int[m+1];
//        int j = 0;
//        for(int i = 0 ; i < nums.length; i ++){
//            if(nums[i]==0){
//                cloneArr[m] = nums[i];
//                m--;
//            }else{
//                cloneArr[j] = nums[i];
//                j++;
//            }
//        }
//        return cloneArr;

    }
}

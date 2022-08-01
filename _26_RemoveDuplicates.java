public class _26_RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,2,2,3,3,3,3,4,4,4,5,5,5,5,6,6,6,6};
        int k = removeDuplicates(nums);
        System.out.println("Số phần tử cần sắp xếp là " + k);
        for(int i : nums){
            System.out.print(i + "\t");
        }
    }

    public static int removeDuplicates(int[] nums) {
        int i = 0;
        int n = 0;
        while(n<nums.length){
            if(nums[i] != nums[n]){
                i++;
                nums[i] = nums[n];
            }
            n++;
        }
        return i+1;
    }
}

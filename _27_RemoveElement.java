public class _27_RemoveElement {
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val = 2;
        int k = removeElement(nums, val);

        for(int l : nums){
            System.out.println(l);
        }
    }

    //Sắp xếp lại
    public static int removeElement(int[] nums, int val) {
        int n = nums.length;
        int i = 0;
        while (i < n) {
            if (nums[i] == val) {
                nums[i] = nums[n - 1];
                n--;
            } else {
                i++;
            }
        }
        return i;
    }
}

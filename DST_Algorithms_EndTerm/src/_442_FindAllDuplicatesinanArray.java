import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class _442_FindAllDuplicatesinanArray {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> result = findDuplicates(nums);
        for (Integer i : result) {
            System.out.println(i);
        }
    }

    public static List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> normal = new HashSet<>();
        HashSet<Integer> duplicate = new HashSet<>();
        for (int i : nums) {
            boolean status = normal.add(i);
            if (!status) {
                duplicate.add(i);
            }
        }
        List<Integer> list = new ArrayList<Integer>(duplicate);
        return list;
    }
}

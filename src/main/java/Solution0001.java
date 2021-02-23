import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author bo.luo
 * @date 2021/2/23 11:34
 */
public class Solution0001 {

    public static void main(String[] args) {

        Solution0001 solution = new Solution0001();
        int target = 9;
        int[] nums = {2, 7, 11, 15};
        System.out.println(Arrays.toString(solution.twoSum(nums, target)));

    }

    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> indexMap = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            int other = target - nums[i];
            if (indexMap.containsKey(other)) {
                return new int[]{i, indexMap.get(other)};
            }
            indexMap.put(nums[i], i);
        }
        return new int[]{0, 1};
    }
}

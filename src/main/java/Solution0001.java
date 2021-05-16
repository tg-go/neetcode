import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 的那 两个 整数，并返回它们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 * <p>
 * 你可以按任意顺序返回答案
 * <p>
 * 输入：nums = [2,7,11,15], target = 9 输出：[0,1] 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
 *
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
    Map<Integer, Integer> indexMap = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      int sub = target - nums[i];
      if (indexMap.containsKey(sub)) {
        return new int[]{i, indexMap.get(sub)};
      }
      indexMap.put(nums[i], i);
    }
    return new int[]{0, 0};
  }
}

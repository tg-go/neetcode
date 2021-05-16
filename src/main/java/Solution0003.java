import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @Author bo.luo3
 * @Date 2021-05-16
 **/
public class Solution0003 {

  public static void main(String[] args) {
    System.out.println(lengthOfLongestSubstring("abcabcbb"));
    System.out.println(lengthOfLongestSubstring(""));
    System.out.println(lengthOfLongestSubstring(" "));
    System.out.println(lengthOfLongestSubstring("abba"));
    System.out.println(lengthOfLongestSubstring("bbbbb"));
  }


  /**
   * 主要思路是通过滑动窗口 主要考虑3个事情： （1）如何判重：hashset （2）如何扩张：遍历时没有重复，则扩张 （3）如何收缩：遇到重复时，则需要把窗口的开始位置放到重复起始位置
   *
   * @param s
   * @return
   */
  public static int lengthOfLongestSubstring(String s) {
    if (s.length() == 0) {
      return 0;
    }
    int length = s.length();
    int start = 0;
    int end = 0;
    int max = 0;
    Map<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < length; i++) {
      if (!map.containsKey(s.charAt(i))) {
        end = i;
        map.put(s.charAt(i), i);
      } else {
        int currentLength = end - start + 1;
        max = currentLength > max ? currentLength : max;
        start = map.get(s.charAt(i)) + 1;
        end = i;
        map.clear();
        for (int j = start; j <= end; j++) {
          map.put(s.charAt(j), j);
        }
      }
    }
    int currentLength = end - start + 1;
    max = currentLength > max ? currentLength : max;
    return max;
  }

}

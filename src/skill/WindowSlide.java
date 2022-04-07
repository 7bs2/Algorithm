package skill;

import java.awt.*;
import java.util.HashMap;
import java.util.Objects;

/**
 * @author the sky
 */
public class WindowSlide {

    public static void main(String[] args) {
        System.out.println(checkInclusion("ab", "eidbaooo"));
    }
    // leetcode 76
    public  static String minWindow(String s, String t) {
        HashMap<Character, Integer> need = new HashMap<>();
        HashMap<Character, Integer> widow = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            need.put(t.charAt(i), need.getOrDefault(t.charAt(i), 0) + 1);
        }
        int left = 0 ,right = 0;

        // 记录对应的位数
        int pos = 0;

        int start = 0, len = Integer.MAX_VALUE;
        while (right < s.length()) {
            char c = s.charAt(right);
            right++;
            if (need.containsKey(c)) {
                widow.put(c, widow.getOrDefault(c, 0) + 1);
                if (Objects.equals(need.get(c), widow.get(c))) {
                    pos++;
                }
            }
            // 满足条件后缩小窗口
            while (pos == need.size()) {
                // 先筛选
                if (right - left < len) {
                    start = left;
                    len = right - left;
                }

                char d = s.charAt(left);

                if (need.containsKey(d)) {
                    widow.put(d, widow.get(d) - 1);
                    if (widow.get(d) < need.get(d)) {
                        pos--;
                    }
                }
                left++;
            }
        }

        System.out.println(start +" " + len);
        return len == Integer.MAX_VALUE? "" : s.substring(start, start + len);
    }

    // leetcode 567
    public static boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> need = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            need.put(s1.charAt(i), need.getOrDefault(s1.charAt(i), 0) + 1);
        }
        int left = 0, right = 0;
        int pos = 0;

        while (right < s2.length()) {
            char c = s2.charAt(right);
            right++;
            if (need.containsKey(c)) {
                window.put(c, window.getOrDefault(c, 0) + 1);
                if (Objects.equals(need.get(c), window.get(c))) {
                    pos++;
                }
            }
            // 开始缩小窗口   缩小的条件
            while (right - left == s1.length()) {
                if (pos == need.size()) {
                    return true;
                }
                char d = s2.charAt(left);
                if (need.containsKey(d)) {
                    window.put(d, window.get(d) - 1);
                    if (window.get(d) < need.get(d)) {
                        pos--;
                    }
                }
                left++;
            }
        }
        return false;
    }
}

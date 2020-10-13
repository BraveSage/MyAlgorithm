import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 *
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 */
public class LengthOfLongestSubstring {


    public static int lengthOfLongestSubstring(String s) {
        if(s.length() == 0){
            return 0;
        }
        int maxLength = 1;
        StringBuilder builder = new StringBuilder();
        builder.append(s.charAt(0));
        for (int i = 1; i < s.length(); i++){
           if(!haveRepeat(builder.toString(), s.charAt(i))){
               maxLength = Math.max(maxLength,builder.length());
               builder.delete(0,builder.indexOf(String.valueOf(s.charAt(i)))+1);
               builder.append(s.charAt(i));
           }else {
               builder.append(s.charAt(i));
               maxLength = Math.max(maxLength,builder.length());
           }

        }
        return maxLength;

    }
    public static int lengthOfLongestSubstring2(String s){
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int end = 0, start = 0; end < n; end++) {
            char alpha = s.charAt(end);
            //如果存在相同的数，那么start点将后移重复的key值后面一位（索引是0为开始，而第一次存储这个的key时是end+1，因此存储的值是index+1）
            if (map.containsKey(alpha)) {
                start = Math.max(map.get(alpha), start);
            }
            ans = Math.max(ans, end - start + 1);
            map.put(s.charAt(end), end + 1);
        }
        return ans;

    }

    public static boolean haveRepeat(String str, char temp){
        for (char ch : str.toCharArray()){
            if(ch == temp){
               return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring2("auabc"));
    }
}

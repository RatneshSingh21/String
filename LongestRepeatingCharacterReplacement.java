//question:https://leetcode.com/problems/longest-repeating-character-replacement/description/

class Solution {
    public int characterReplacement(String s, int k) {
        s=s.toUpperCase();
        HashMap<Character, Integer> map = new HashMap<>();
        int maxLength = 0;
        int maxCount = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            maxCount = Math.max(maxCount, map.get(ch));

            if (right - left + 1 - maxCount > k) {
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}

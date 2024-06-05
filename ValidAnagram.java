//question:https://leetcode.com/problems/valid-anagram/description/?envType=study-plan-v2&envId=top-interview-150

class Solution {
    public boolean isAnagram(String s, String t) {

        //convert the string into lowercase
         s=s.toLowerCase();
        t=t.toLowerCase();
        
        //convert the String into  Array
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

      //sort the Arrays
        Arrays.sort(sArray);
        Arrays.sort(tArray);

        return Arrays.equals(sArray, tArray);
    }
}

//question:https://leetcode.com/problems/ransom-note/description/?envType=study-plan-v2&envId=top-interview-150

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
       
       int[] arr =new int[26];

       for(char ch:magazine.toCharArray())
       {
        arr[ch-'a']++;
       }

       for(char ch1:ransomNote.toCharArray())
       {
        if(arr[ch1-'a']==0)
        {
            return false;
        }
         arr[ch1-'a']--;
       }
      return true;
    }
}

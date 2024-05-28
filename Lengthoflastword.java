  // Length Of the Last Word

class Solution {
    public int lengthOfLastWord(String s) {
        //spilt the string
        String[] parts = s.split(" ");
        //return the length of the last word
       return (parts[parts.length-1].length());
    }
}

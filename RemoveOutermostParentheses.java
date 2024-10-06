class Solution {
    public String removeOuterParentheses(String s) {
         StringBuilder result = new StringBuilder();
         int open = 0; 
         for(int i=0;i<s.length();i++)
         {
            char ch = s.charAt(i);

            if(ch=='(')
            {
                if(open>0)
                {
                    result.append(ch);
                }
               open++;
            }
            else if(ch==')')
            {
                open--;
                if(open>0)
                {
                    result.append(ch);
                }
                
            }
            
         }
         return result.toString();
    }
}

class Solution {
    public String removeDuplicateLetters(String s) {
        int[] last=new int[26];
        for(int i=0;i<s.length();i++)
         last[s.charAt(i)-'a']=i;
         boolean[] seen=new boolean[26];
         Stack<Integer> st=new Stack();
         for(int i=0;i<s.length();i++)
         {
            int c=s.charAt(i)-'a';
            if(seen[c]) continue;
            while(!st.isEmpty() && st.peek()>c && i<last[st.peek()])
               seen[st.pop()] =false;
            st.push(c);
            seen[c]=true;
         }
         StringBuilder sb=new StringBuilder();
         while(!st.isEmpty())
           sb.append((char)(st.pop() + 'a'));
        return sb.reverse().toString();
    }
}
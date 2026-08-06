
class Solution {
    public int evalRPN(String[] tok) {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<tok.length;i++)
        {
            if(tok[i].equals("+"))
            {
                int one = st.pop();
                int two = st.pop();
                st.push(one+two);
                
            }
            else if(tok[i].equals("-"))
            {
                int one = st.pop();
                int two = st.pop();
                st.push(two-one);
            }
            else if(tok[i].equals("*"))
            {
                int one = st.pop();
                int two = st.pop();
                st.push(two*one);
            }
            else if(tok[i].equals("/"))
            {
                int one = st.pop();
                int two = st.pop();
                st.push(two/one);
            }
            else
            {
            int ch =Integer.parseInt(tok[i]);
           
                st.push(ch);
            }
        
        }
        return st.pop();
    }
}
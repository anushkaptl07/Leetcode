class Solution {
    public int calPoints(String[] op) {
        Stack<Integer> st = new Stack<>();
        int ans = 0;
        for(int i=0;i<op.length;i++)
        {
            
            if(op[i].charAt(0)=='D')
            {
                int c = st.peek();
                st.push(c*2);
            }
            else if(op[i].charAt(0)=='C')
            {
                st.pop();
            }
            else if(op[i].charAt(0)=='+')
                {
                    int a = st.pop();
                    int b = st.peek();

                    st.push(a);
                    st.push(a + b);
                }
            else
            {
              st.push(Integer.parseInt(op[i]));
            }
        }
         while(!st.isEmpty())
        {
            ans += st.pop();
        }
        return ans;
    }
}
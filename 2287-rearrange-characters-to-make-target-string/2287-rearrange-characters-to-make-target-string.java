class Solution {
    public int rearrangeCharacters(String s, String target) {
        HashMap<Character,Integer> m = new HashMap<>();
        for(int i=0;i<target.length();i++)
        {
            m.put(target.charAt(i),m.getOrDefault(target.charAt(i),0)+1);
        }
   
         HashMap<Character,Integer> m2 = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
          
             m2.put(s.charAt(i),m2.getOrDefault(s.charAt(i),0)+1);
           
        }
        int result = Integer.MAX_VALUE;
        for(Map.Entry<Character,Integer>e:m.entrySet())
        {
          char ch = e.getKey();
          int r = e.getValue();
          int a = m2.getOrDefault(ch,0);
          result = Math.min(result,a/r);
        }
        return result;
    }
}
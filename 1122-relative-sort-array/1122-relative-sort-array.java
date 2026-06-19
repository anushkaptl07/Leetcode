class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] ans = new int[arr1.length];
        int k=0;
        for(int i=0;i<arr2.length;i++)
        {
            int curr = arr2[i];
            for(int j=0;j<arr1.length;j++)
            {
                if(arr1[j]==curr)
                {
                    ans[k]=curr;
                    arr1[j]=Integer.MAX_VALUE;
                    k++;
                }
            }
        }
        int[] ne = new int[arr1.length-k];
        int p=0;
        for(int i=0;i<arr1.length;i++)
        {
            if(arr1[i]!=Integer.MAX_VALUE)
            {
                ne[p]=arr1[i];
                p++;
            }
        }
        Arrays.sort(ne);
       int w=0;
        for(int i=k;i<arr1.length;i++)
        {
            ans[i]=ne[w];
            w++;
        }
        return ans;
    }
}
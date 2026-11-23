class ProductOfNumbers {
    List<Integer> list;
    public ProductOfNumbers() {
        list = new ArrayList<>();
    }
    
    public void add(int num) {
        this.list.add(num);
    }
    
    public int getProduct(int k) {
        int pro = 1;
        int n = this.list.size();
        for(int i=n-k;i<n;i++)
        {
            pro *= this.list.get(i);
        }
        return pro;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */
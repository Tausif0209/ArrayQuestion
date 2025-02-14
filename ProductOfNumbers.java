class ProductOfNumbers {
    ArrayList<Integer> list;
    int  size;
    int  pro;
    public ProductOfNumbers() {
        list=new ArrayList<>();
        size=0;
        pro=1;
    }
    
    public void add(int num) {
        if(num==0){
            pro=1;
            size=0;
            list=new ArrayList<>();
            return;
        }
        pro*=num;
        list.add(pro);
        size++;
    }
    
    public int getProduct(int k) {
       if(k>size) return 0;
       if(k==size) return pro;
       return pro/(list.get(size-k-1));
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */
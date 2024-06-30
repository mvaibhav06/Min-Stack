class MinStack {
    private Stack<Integer> temp;
    private List<Integer> vals;

    public MinStack() {
        this.temp = new Stack<Integer>();
        this.vals = new ArrayList<>();
    }
    
    public void push(int val) {
        temp.push(val);
        vals.add(val);
    }
    
    public void pop() {
        temp.pop();
        vals.remove(vals.size()-1);
    }
    
    public int top() {
        return temp.peek();
    }
    
    public int getMin() {
        int min = Integer.MAX_VALUE;
        for(int i=0; i<vals.size(); i++){
            min = Math.min(min,vals.get(i));
        }
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

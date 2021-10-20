// Time Complexity : O(1)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no

class MinStack {

    Stack<Integer> stack;
    int min = Integer.MAX_VALUE;
    
    public MinStack() {
        stack = new Stack<Integer>();
        stack.push(min);
    }
    
    public void push(int val) {
        
        if(min>=val){
            stack.push(min);
            min = val;
        }
        
        stack.push(val);
    }
    
    public void pop() {
        
        int temp = stack.pop();
        if(temp == min){
            min = stack.peek();
            stack.pop();
        }
        
    }
    
    public int top() {
        
        return stack.peek();
    }
    
    public int getMin() {
        
        return min;
    }
}
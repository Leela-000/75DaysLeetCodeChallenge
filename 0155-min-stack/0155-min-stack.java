class MinStack{
    Stack<int[]> stack=new Stack<>();
    public MinStack(){
        stack=new Stack<>();
    }
    public void push(int val){
        if(!stack.isEmpty()){
            stack.push(new int[]{val,Math.min(val,stack.peek()[1])});}
            else{
                stack.push(new int[]{val,val});
            }
    }
    public void pop(){
        if(!stack.isEmpty()){
            stack.pop();
        }
        
    }
    public int getMin(){
        if(!stack.isEmpty()){
            return stack.peek()[1];
        }
        return -1;
    }
    public int top(){
        if(!stack.isEmpty()){
            return stack.peek()[0];
        }
        return -1;
    }
}

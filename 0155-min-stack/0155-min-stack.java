class Node{
    int value;
    int min;

    public Node(int value, int min){
        this.value = value;
        this.min = min;
    }
}
class MinStack {
    Stack<Node> s;
    public MinStack() {
        s = new Stack<Node>();
    }
    
    public void push(int val) {
        if(s.isEmpty()){
            Node n = new Node(val,val);
            s.push(n);
            return;
        }
        Node topmin = s.peek();
        int min = topmin.min;

        if(val <min){
            Node n = new Node(val,val);
            s.push(n);
        }else{
            Node n = new Node(val,min);
            s.push(n);
        }

    }
    
    public void pop() {
        if(s.isEmpty()){
            return;
        }
        s.pop();
    }
    
    public int top() {
        if(s.isEmpty()){
            return -1;
        }
        Node nodeTop = s.peek();
        return nodeTop.value;
    }
    
    public int getMin() {
        if(s.isEmpty()){
            return -1;
        }
        Node nodeTop = s.peek();
        return nodeTop.min;
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
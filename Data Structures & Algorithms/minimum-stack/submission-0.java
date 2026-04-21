class MinStack {
    int size;
    int[] arr;
    int[] min;
    int top;
    int mintop;
    public MinStack() {
           size=1000;
           arr=new int[size];
           min=new int[size];
           top=-1;
           mintop=-1;
    }
    
    public void push(int val) {
        if(top==size-1){
            return;
        }

        top++;
        arr[top]=val;
        if(mintop==-1||val<=min[mintop]){
            mintop++;
            min[mintop]=val;
        }
    }
    
    public void pop() {
        if(top==-1){
            return;
        }
        int data=arr[top];
        top--;
        if(min[mintop]==data){
            mintop--;
        }
    }
    
    public int top() {
            if(top==-1) return -1;
            return arr[top];
    }
    
    public int getMin() {
          if(mintop==-1) return -1;
          return min[mintop];
    }
}

public class Stack {
    private int[] arr;
    private int size;
    Stack(int s){
        arr = new int[s];
    }
    public void push(int value){
        if(size==arr.length) return;
        arr[size++] = value;
    }
    public int pop(){
        if(isEmpty()) return 0;
        return arr[--size];
    }
    public int peek(){
        if(isEmpty()) return 0;
        return arr[size-1];
    }
    public boolean isEmpty(){return size==0;}
    public int size(){return size;}
}

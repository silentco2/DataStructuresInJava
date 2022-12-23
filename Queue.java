public class QueueArray {
    int[] arr;
    int size,front,rear,length;
    QueueArray(int s){
        arr = new int[s];
        length = s;
    }
    public void enqueue(int value){
        if (isFull()) throw new ArrayStoreException("Overflow");
        arr[rear++%length] = value;
        size++;
    }
    public int dequeue(){
        if (isEmpty()) throw new ArrayStoreException("Underflow");
        int value = arr[front++%length];
        size--;
        return value;
    }
    public int peek(){return arr[front];}
    private boolean isFull(){return size==length;}
    public boolean isEmpty(){return size==0;}
    public int size(){return size;}
}

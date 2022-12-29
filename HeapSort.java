public class HeapSort {
    int[] arr;
    Sort(int[] a){arr = a;}
  
    public void Heap(){
        buildHeap();
        for(int i=arr.length-1;i>=0;i--){
            swap(0,i);
            heapify(0,i);
        }
    }
  
    private void buildHeap(){for (int i=arr.length/2-1;i>=0;i--) heapify(i,arr.length);}
  
    private void heapify(int root,int size){
        int left = root*2+1,right = left+1;
        int max = root;
        if (left<size && arr[left]>arr[max]) max = left;
        if (right<size && arr[right]>arr[max]) max = right;
        if (max != root){
            swap(root,max);
            heapify(max,size);
        }
    }
  
    private void swap(int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

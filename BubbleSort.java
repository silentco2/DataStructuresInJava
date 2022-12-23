public class BubbleSort {
    int[] arr;
    Sort(int[] a){
        arr = a;
    }
    public void Bubble(){
        for (int i=0;i<arr.length-1;i++)
            for(int j=0;j<arr.length-i-1;j++)
                if(arr[j]>arr[j+1]) 
                    swap(j,j+1);
    }
  private void swap(int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

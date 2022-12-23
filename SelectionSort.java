public class SelectionSort {
    int[] arr;
    Sort(int[] a){arr = a;}
  
    public void Selection(){
        for (int i=0;i<arr.length;i++){
            int min = i;
            for (int j = i;j<arr.length;j++){
                if (arr[min]>arr[j]) min = j;
            }
            swap(min,i);
        }
    }
  
    private void swap(int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

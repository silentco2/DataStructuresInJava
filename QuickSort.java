public class QuickSort {
    int[] arr;
    Sort(int[] a){arr = a;}
  
    public void Quick(){Quick(0,arr.length-1);}
  
    private void Quick(int low,int high){
        if (low >= high) return;
        int pivot = arr[high], left = low, right = high;
        while (left<right){
            while (left<right && arr[left]<=pivot)left++;
            while (left<right && arr[right]>=pivot)right--;
            swap(left,right);
        }
        swap(left,high);
        Quick(low,left-1);
        Quick(left+1,high);
    }
}

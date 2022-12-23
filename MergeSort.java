public class MergeSort {
    int[] arr;
    Sort(int[] a){arr = a;}
  
    public void Merge(){Merge(arr);}
  
    private void Merge(int[] a){
        if (a.length<2) return;
        int mid = a.length/2;
        int[] left = new int[mid];
        int[] right = new int[a.length-mid];
        for (int i=0;i<mid;i++) left[i] = a[i];
        for (int i =mid;i<a.length;i++) right[i-mid] = a[i];
        Merge(left);
        Merge(right);
        mergeSorted(a,left,right);
    }
  
    private void mergeSorted(int[] a,int[] l,int[] r){
        int i=0,j=0,k=0;
        while (i<l.length&&j<r.length){
            if(l[i]<r[j]) a[k++] = l[i++];
            else a[k++] = r[j++];
        }
        while (j<r.length) a[k++] = r[j++];
        while (i<l.length) a[k++] = l[i++];
    }

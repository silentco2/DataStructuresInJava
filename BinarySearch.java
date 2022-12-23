public class BinarySearch {
    int[] arr;
    LinearSearch(int[] a){arr = a;}

    public int Search (int value){
        int l = 0, h = arr.length-1;
        while (l != h) {
            int i = (h+l)/2;
            if (arr[i] == value) return i;
            else if (arr[i] < value) l = i+1;
            else h = i-1;
        }
        return -1;
    }
}

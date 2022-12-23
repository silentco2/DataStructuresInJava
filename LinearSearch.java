public class LinearSearch {
    int[] arr;
    LinearSearch(int[] a){arr = a;}
    
    public int Search(int value) {
        for (int i = 0; i < arr.length; i++) if (arr[i] == value) return i;
        return -1;
    }
}

public class LastOccurrence {
    public static int lastOccur(int[]arr, int key, int i){
        if(i==arr.length) return -1;
        int j = lastOccur(arr, key, i+1);
        if(j==-1 && arr[i]==key){
            return i;
        }
        return j;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,2,5};
        System.out.println(lastOccur(arr, 2, 0));
    }
}

public class FirstOccurence{
    public static int firstOccur(int[]arr,int key,int i){
        if(arr[i]==key){
            return i;
        }
        if(i==arr.length-1) return -1;
        return firstOccur(arr, key, i+1);

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,2,5};
        System.out.println(firstOccur(arr, 2, 0));
    }
}
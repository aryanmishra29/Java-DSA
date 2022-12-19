public class BinarySearch{
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,6,7,8,9};
        int key=5;
        System.out.println(binarySearch(array, key));
        
    }
    public static  int binarySearch(int arr[],int key){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]>key){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
        //time complexity = O(log n)
    }
}
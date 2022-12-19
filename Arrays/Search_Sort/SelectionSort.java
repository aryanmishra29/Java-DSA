
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={1,4,2,3,7,5};
        selectSort(arr);
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void selectSort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int minPos = i;
            for(int j=i+1;j<n;j++){
                if(arr[minPos]>arr[j])minPos=j;
            }
            int temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos]=temp;
        }
    }
    
}
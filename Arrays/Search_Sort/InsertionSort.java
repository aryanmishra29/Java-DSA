public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={1,4,2,3,7,5};
        insertSort(arr);
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void insertSort(int[] arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            // for(int j=0;j<i;j++){
            //     int temp = arr[i];
            //     k=i;
            //     if(temp<arr[j]){
            //         arr[j+1]=arr[j];
            //         k=j;
            //     }
            //     arr[k]=temp;
            // }
            int temp=arr[i];
            int prev = i-1;
            while(prev>=0&&arr[prev]>temp){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=temp;
        }
    }
}

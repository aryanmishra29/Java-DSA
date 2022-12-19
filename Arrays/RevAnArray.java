
public class RevAnArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        revArray(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void revArray(int[] arr){
        int i=0,j=arr.length-1;
        while(i<j){
            arr[i] = arr[i] + arr[j];
            arr[j] = arr[i] - arr[j];
            arr[i] = arr[i] - arr[j];
            i++;
            j--;
        }
    }
}

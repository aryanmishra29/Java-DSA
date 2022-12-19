public class Sum_SubArrays{
    public static void main(String[] args) {
        int[] arr={-1,-2,6,-1,-3};
        System.out.println(maxSumSubArr(arr));
    }
    public static int maxSumSubArr(int[] arr){
        int sum=0,max_sum=Integer.MIN_VALUE;
        /* Brute Force:
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++) sum+=arr[k];
                if(sum>max_sum) max_sum=sum;
                sum=0;
            }
        }*/
        //using prefix sum:
        /*
        int[] prefix = new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                sum=(i==0)?prefix[j]:prefix[j]-prefix[i-1];
                if(sum>max_sum) max_sum=sum;
                sum=0;
            }
        }*/
        //using Kadane's Algorithm
        int max_neg=Integer.MIN_VALUE;
        int check=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0&&arr[i]>max_neg) max_neg=arr[i];
            sum+=arr[i];
            if(sum<0) sum=0;
            if(max_sum<sum){
                max_sum=sum;
                check++;
            }
        }
        if(check>1) return max_sum;
        else return max_neg;
    }
}
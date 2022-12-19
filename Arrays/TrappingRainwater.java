/*Given n non negative integers reprresenting an elevation map where the width of each bar is 1,
compute how much water it can trap after raining?
 */
public class TrappingRainwater {
    public static void main(String[] args) {
        int arr[]={2,4,6,2,6,7,1};
        System.out.println(rainwater(arr));
    }
    public static int rainwater(int arr[]){
        int rain=0,lmax=0,rmax=0;
        for(int i=1;i<arr.length-1;i++){
            lmax=0;rmax=0;
            for(int j=0;j<i;j++){
                lmax=Math.max(lmax, arr[j]);
            }
            for(int j=i+1;j<arr.length;j++){
                rmax=Math.max(rmax, arr[j]);
            }
            int lev=Math.min(lmax, rmax);
            if(arr[i]>lev) continue;
            else{
                rain+=lev-arr[i];
            }
        }
        return rain;
    }
}

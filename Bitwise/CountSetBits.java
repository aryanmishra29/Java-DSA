public class CountSetBits {
    public static int countSetBits(int n){
        int bitmask=1;
        int count =0;
        double l = Math.log(n)/Math.log(2);
        for(int i=0;i<=(int)l;i++){
            bitmask=1<<i;
            if((n & bitmask)!=0) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countSetBits(153));
    }
}

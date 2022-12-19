public class FastExponent {
    public static long power(long b, int p){
        long ans=1;
        while(p!=0){
            if((p & 1)!=0) ans*=b;
            b*=b;
            p=p>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(power(2, 32));
    }
}

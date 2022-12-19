public class Ith_bit {
    public static int get_ith_bit(int n,int i){
        if((n&(1<<i))==0)return 0;
        else return 1;
    }
    public static int set_ith_bit(int n,int i){
        int bitmask = 1<<i;
        return (n|bitmask);
    }
    public static int clear_ith_bit(int n,int i){
        int bitmask = ~(1<<i);
        return n & bitmask;
    }
    public static int update_ith_bit(int n,int i,int val){
        if(val==0){
            return clear_ith_bit(n, i);
        }
        else{
            return set_ith_bit(n, i);
        }
    }
    public static int clear_i_bits(int n,int i){
        int bitmask = (~0)<<i;
        return n & bitmask;
    }
    public static int clear_i_to_j(int n,int i, int j){
        int a=(~0)<<(j+1);
        int b=(1<<i)-1;
        int bitmask=a|b;
        return n & bitmask;
    }
    public static void main(String[] args) {
        System.out.println(get_ith_bit(10, 2)); 
        System.out.println(set_ith_bit(10, 2));
        System.out.println(clear_ith_bit(10, 1));
        System.out.println(clear_i_bits(15, 2));
        System.out.println(clear_i_to_j(10, 2, 4));

    }    
}

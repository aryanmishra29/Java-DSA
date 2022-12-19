public class Power {
    public static long pow(int x,int n){
        if(n==0) return 1;
        return x * pow(x,n-1);
    }//time complexity O(n)
    public static long mpow(int x, int n){
        if(n==0) return 1;
        long temp = pow(x,n/2);
        if(n%2==0) {
            return temp*temp;
        }
        else return x*temp*temp;
    }//time complexity O(log n)
    public static void main(String[] args) {
        System.out.println(mpow(11,30));
        System.out.println(pow(11, 30));
    }
}

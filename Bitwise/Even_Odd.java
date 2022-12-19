public class Even_Odd {
    public static void parity(int n){
        int bitmask = 1;
        if((n & bitmask) == 0) System.out.println("even");
        else System.out.println("odd");
    }
    public static void main(String[] args) {
        parity(3);
        parity(11);
        parity(14);
    }
}

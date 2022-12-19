public class Swap_XOR {
    public static void main(String[] args) {
        int x=2,y=4;
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println(x+" "+y);
    }
}

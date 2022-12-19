public class Patterns {
    public static void main(String[] args) {
        //inverHalfTri(10, 10);
        //hollowRect(10, 10);
        //butterfly(5);
        rhombus(5);
        hollow_rhombus(5);
    }
    public static void inverHalfTri(int r, int c){
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++) {
                if(j<=c-i) System.out.print(" ");
                else System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void hollowRect(int l,int b){
        for(int i=1;i<=b;i++){
            for(int j=1;j<=l;j++) {
                if(i==1 || i==b || j==1 || j==l) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
    /* My Approach
    public static void butterfly(int n){
        n++;
        for(int i=1;i<=n;i++){
            if(i<=n/2){
                for(int j=1;j<=i;j++) System.out.print("*");
                for(int j=1;j<=n-(2*i);j++) System.out.print(" ");
                for(int j=1;j<=i;j++) System.out.print("*");
            }
            else{
                for(int j=1;j<=n-i;j++) System.out.print("*");
                for(int j=1;j<=(2*i)-n;j++) System.out.print(" ");
                for(int j=1;j<=n-i;j++) System.out.print("*");
            }
            System.out.println();
        }
    }
    */
    // Efficient Approach
    public static void butterfly(int n){
        //1st half
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++) System.out.print("*");
            for(int j=1;j<=2*(n-i);j++) System.out.print(" ");
            for(int j=1;j<=i;j++) System.out.print("*");
            System.out.println();
        }
        //2nd half
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++) System.out.print("*");
            for(int j=1;j<=2*(n-i);j++) System.out.print(" ");
            for(int j=1;j<=i;j++) System.out.print("*");
            System.out.println();
        }
    }
    public static void rhombus(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++) System.out.print(" ");
            for(int j=1;j<=n;j++) System.out.print("*");
            System.out.println();
        }
    }
    public static void hollow_rhombus(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++) System.out.print(" ");
            if(i==1 || i==n){
                for(int j=1;j<=n;j++) System.out.print("*");
            }
            else{
                System.out.print("*");
                for(int j=1;j<=n-2;j++) System.out.print(" ");
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

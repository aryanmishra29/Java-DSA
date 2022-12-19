import java.util.Scanner;

public class SpiralMatrix{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int srow=0;
        int erow=n-1;
        int scol=0;
        int ecol=m-1;
        int [][] A=new int [n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                A[i][j]=sc.nextInt();
            }
        }
        while(srow<=erow && scol<=ecol){
            for(int i=scol;i<=ecol;i++){
                System.out.print(A[srow][i]+", ");
            }
            srow++;
            for(int i=srow;i<=erow;i++){
                System.out.print(A[i][ecol]+", ");
            }
            ecol--;
            for(int i=ecol;i>=scol;i--){
                System.out.print(A[erow][i]+", ");
            }
            erow--;
            for(int i=erow;i>=srow;i--){
                System.out.print(A[i][scol]+", ");
            }
            scol++;
        }
    }
}
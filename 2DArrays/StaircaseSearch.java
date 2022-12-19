import java.util.Scanner;


public class StaircaseSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [][] A=new int [n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                A[i][j]=sc.nextInt();
            }
        }
        int k=sc.nextInt();
        search(A, k);
    }
    public static void search(int arr[][],int key){
        int i=0,j=arr[0].length-1;
        while(i<=arr.length-1 && j>=0){
            if(arr[i][j]==key){
                System.out.println("Found at: "+i+","+j);
                return;
            }
            else if(arr[i][j]<key) i++;
            else j--;
        }
        System.out.println("Not Found");
    }
}//time complexity = O(n+m)

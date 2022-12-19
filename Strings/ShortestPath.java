
import java.util.Scanner;

public class ShortestPath {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String dir = sc.next();
        float disp=shortPath(dir);
        System.out.println(disp);
    }
    public static float shortPath(String dir){
        int i=0,j=0;
        for(int k=0;k<dir.length();k++){
            switch (dir.charAt(k)) {
                case 'N':
                    j++;
                    break;
                case 'E':
                    i++;
                    break;
                case 'S':
                    j--;
                    break;
                case 'W':
                    i--;
                    break;
                default:
                    break;
            }
        }
        float disp =(float) Math.sqrt(Math.pow(i,2)+Math.pow(j,2));
        return disp;
    }
}

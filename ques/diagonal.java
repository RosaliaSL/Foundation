import java.util.*;
class diagonal{
    static Scanner scn = new Scanner(System.in);

    public static void input(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                arr[i][j]= scn.nextInt();
            }
        }
    }

    public static void diagonal(int[][] arr){
        int rmin=0; int rmax= arr.length-1;
        int cmin=0; int cmax= arr[0].length-1;
        int a=0;
        for(int i=0; i<= rmax; i++){
            a= rmax-i; 
            for(int j=0; j<=i; j++){
                if(j>cmax){
                    continue;
                }
                System.out.print(arr[a][j]+" ");
                a++;
            }
        }
        for(int j=1; j<=cmax; j++){
            a=j;
            for(int i=0; i<=cmax-j; i++){
                if(i>rmax){
                    continue;
                }
                System.out.print(arr[i][a]+" ");
                a++;
            }
        }

    }
    public static void main(String[] args){
        int r= scn.nextInt();
        int c= scn.nextInt();
        int[][] arr= new int[r][c];
        input(arr);
        diagonal(arr);
    }
}
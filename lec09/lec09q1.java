import java.util.*;
class lec09q1{
    static Scanner scn= new Scanner(System.in);
    
    public static void fill(int[][] arr){
        int count =1;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                arr[i][j]= count;
                count++;
            }
        }
    }
    public static void display(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print (arr[i][j]+ " ");
               }
               System.out.println();
        }
    }

    public static void multiply(int[][] arr1, int [][]arr2){
        int[][] ans= new int[arr1.length][arr2.length];
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr1.length; j++){
                for(int k=0; k<arr1.length; k++){
                    ans[i][j]+= arr1[i][k]*arr2[k][j];
                }
            }
        }
        display(ans);
            
}

public static void waveDisplay(int[][] arr){
for(int i=0; i<arr[0].length; i++){
        if(i%2==0){
        for(int j=0; j<arr.length; j++){
            System.out.print(arr[j][i]+ " ");
        }
    }
    else{
            for(int j=arr.length-1; j>=0; j--){
                System.out.print(arr[j][i]+ " ");
        
            }
        
    }
    }
}

// public static  void waveDisplay2(int[][] arr){
//     if()
// }

    
    public static void main(String[] args){
        int[][] arr= new int[3][4];
        fill(arr);
        display(arr);
        waveDisplay(arr);

    }
}
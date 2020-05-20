import java.lang.reflect.Array;
import java.util.*;
class lec20{
    static Scanner scn= new Scanner(System.in);

    public static int max(int a, int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }
    
    public static int max3(int a, int b, int c){
        if(a>b && a>c){
            return a;
        }
        else if(b>c){
            return b;
        }
        else{
            return c;
        }
    }
    
    public static int sirGoldmine(int[][] arr){
        int[][] dp = new int[arr.length][arr[0].length];
        
        for(int row=0; row<dp.length; row++){
            dp[row][dp[0].length-1]= arr[row][dp[0].length-1];
        }
        for(int col=arr[0].length-2; col>=0; col--){
            for(int row=0; row<arr.length; row++){
                if(row==0){
                    dp[row][col]= arr[row][col]+
                    max(dp[row+1][col+1],dp[row][col+1]);
                }
                else if(row== arr.length-1){
                    dp[row][col]=arr[row][col]+ 
                    max(dp[row-1][col+1],dp[row][col+1]);
                }
                else{
                    dp[row][col]=arr[row][col]+ 
                    max3(dp[row-1][col+1],dp[row][col+1], dp[row+1][col+1]);
                }
            }
        }
        int ans=dp[0][0];
        for(int row=1; row<arr.length; row++){
            if(dp[row][0]>ans){
                ans= dp[row][0];
            }
        }
        return ans;
    }

//    public static int goldmine(int[][] arr){
//         int n= arr.length;
//         int m= arr[0].length;
//         int[][] dp= new int[n][m];
//         for(int i=0; i<n; i++){
//             dp[i][m-1]= arr[i][m-1];
//         }
//         // for(int i=n-2; i>=0; i--){
//         //     for(int j=0; j<m; j++){
//         //         if(j-1>=0 && j+1<=m-1){
//         //             int max= Math.max(arr[i+1][j-1], arr[i+1][j], arr[i+1][j+1]);
//         //         }
//         //         else if(j-1<0 && j+1<= m-1){
//         //             int max= Math.max(arr[i+1][j], arr[i+1][j+1]);
//         //         }
//         //         else if(j-1>=0 && j+1>m-1){
//         //             int max= Math.max(arr[i+1][j], arr[i+1][j-1]);
//         //         }
//                 // dp[i][j]= dp[i][j]+max;
//             }
//         }
//         int ans= dp[0][0];
//         for(int j=1; j<m; j++){
//             if (dp[0][j]> ans){
//                 ans = dp[0][j];
//             }
//         }
//         return ans;
//     }



    

    public static void main(String[] args){
        int n= scn.nextInt();
        int m= scn.nextInt();

        // int[][] arr= 
        int target =10;
        int[] arr= {4, 1, 2, 7};
        targetsubset(arr, 0, target, "");



    }
}
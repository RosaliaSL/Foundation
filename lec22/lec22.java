import java.lang.reflect.Array;
import java.util.*;
class lec22{
    static Scanner scn= new Scanner(System.in);

    public static int maxknapsack(int[] prices, int[] weights, int cap, int idx){
        int r1, r2=0;
        if(idx== prices.length){
           return 0;
        }

        r1= maxknapsack(prices, weights, cap, idx+1);
        
        if(weights[idx]<=cap){
        r2= maxknapsack(prices, weights, cap-weights[idx], idx+1) + prices[idx];
        }
        
        int profit = Math.max(r1,r2);
        return profit;
    }

    // public static int maxknapsackM(int[] prices, int[] weights, int cap, int idx, int[] dp){
    //     int r1, r2=0;
    //     if(idx== prices.length){
    //        return 0;
    //     }
    //     if(dp[idx]!=0){
    //         return dp[idx];
    //     }
    //     r1= maxknapsackM(prices, weights, cap, idx+1,dp);
        
    //     if(weights[idx]<=cap){
    //     r2= maxknapsackM(prices, weights, cap-weights[idx], idx+1,dp) + prices[idx];
    //     }
        
    //     int profit = Math.max(r1,r2);
    //     dp[idx]= profit;
    //     return profit;
    // }

    public static int maxknapsackT(int[] prices, int[] weights, int cap, int idx){
        int[][] dp = new int[prices.length+1][cap+1];

        for(int row=1; row<dp.length; row++){
            for(int col=1; col<dp[0].length; col++){
                int r1=0; int r2=0;
                r1= dp[row-1][col];
                
                if(col>= weights[row-1]){
                r2= dp[row-1][col-weights[row-1]] + prices[row-1];}

                dp[row][col]= Math.max(r1,r2);

            }
        }
        
        return dp[dp.length-1][dp[0].length-1];
    }

    public static int countbinarystring(int n, String ans){
        if(n==0){
            return 1;
        }
        int answer=0;

        answer+= countbinarystring(n-1, ans+'1');
        if(ans.charAt(ans.length()-1)!='0'){
        answer+= countbinarystring(n-1, ans+'0');
        }
        return answer;
    }

    public static int countbinarystrT(int n){
        int[][] dp = new int[2][n+1];

        dp[0][0]=0;
        dp[1][0]=1;

        for(int col=1; col<dp[0].length; col++){
            for(int row=0; row<=1; row++){
                if(row==0){
                    dp[row][col]= dp[row+1][col-1];
                }
                if(row==1){
                    dp[row][col]= dp[row][col-1]+dp[row-1][col-1];
            }
        }
    }
        int sum= dp[0][n]+dp[1][n];

        return sum;
    }

    public static int countbinarystr1D(int n){
        int[] end0= new int[n+1];
        int[] end1= new int[n+1];

        end0[1]=1;
        end1[1]=1;

        for(int i=2; i<=n; i++){
            end0[i]= end1[i-1];
            end1[i]= end0[i-1]+end1[i-1];
        }
        int ans= end0[n]+end1[n];
        return ans;
    }

    

    public static void main(String[] args){
    // int n= scn.nextInt();
    // int[] prices= new int[n];
    // int[] weights= new int[n];
    // for(int i=0; i<n; i++){
    //     prices[i]= scn.nextInt();
    // }
    // for(int j=0; j<n; j++){
    //     weights[j]= scn.nextInt();
    // }
    // int cap= scn.nextInt();
    // int[] dp= new int[n+1];

    // System.out.println(maxknapsack(prices, weights, cap, 0));
    // System.out.println(maxknapsackT(prices, weights, cap, 0));
    System.out.println(countbinarystrT(6));
    System.out.println(countbinarystr1D(6));
    System.out.println(countbinarystring(6, " "));

    }
}

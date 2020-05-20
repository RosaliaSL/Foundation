import java.lang.reflect.Array;
import java.util.*;
class lec27{
    static Scanner scn= new Scanner(System.in);

    public static int ccp(int[] coins, int t){
        int[] dp= new int[t+1];
        dp[0]=1;

        for(int i=1; i<dp.length; i++){
            for(int j=0; j<i; j++){
                for(int k=0; k<coins.length; k++){
                    if(coins[k]+j==i){
                        dp[i]+=coins[j];
                    }
                }
            }
        }
        return dp[dp.length-1];
    }

   

   
    public static void main(String[] args){
    int n= scn.nextInt();
    // System.out.print(arrangeBuilding(n));
    int[] coins= new int[n];
    for(int i=0; i<n; i++){
        coins[i]= scn.nextInt();
    }
    int target = scn.nextInt();
    System.out.print(ccp(coins, target));

  

    }
}
import java.lang.reflect.Array;
import java.util.*;
class lec19{
    static Scanner scn= new Scanner(System.in);

    //Dynamic Programming- fibonacci by memoization

    public static int fiboM(int n,int[] dp){
        if(n==1 || n==0){
            return n;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        int nm1= fiboM(n-1,dp);
        int nm2= fiboM(n-2,dp);
        dp[n]=nm1+nm2;
        return nm1+nm2;
    }

    public static int fiboT(int n){
        int[] dp= new int[n+1];
        dp[0]=0;
        dp[1]=1;

        for(int i=2; i<=n; i++){
            int nm1= dp[i-1];
            int nm2= dp[i-2];
            dp[i]= nm1+nm2;
        }
        return dp[n];
    }

    public static int stairpathM(int n, int[] dp){
        if(n==0){
            return 1;
        }

        if(dp[n]!=0){
            return dp[n];
        }
        int ans=0;
        if(n-1>=0){
            ans+=stairpathM(n-1, dp);
        }
        if(n-2>=0){
            ans+=stairpathM(n-2, dp);
        }
        if(n-3>=0){
            ans+=stairpathM(n-3, dp);
        }
        dp[n]=ans;
        return ans;
    }

    public static int stairpathT(int n){
        int[] dp= new int[n+1];
        dp[0]=1;

        for(int i=1; i<=n; i++){
            int ans=0;
            if(i-1>=0){
                ans+=dp[i-1];
            }
            if(i-2>=0){
                ans+=dp[i-2];
            }
            if(i-3>=0){
                ans+=dp[i-3];
            }
            dp[i]=ans;
        }

        return dp[n];
    }

    public static void main(String[] args){
        int n=44;
        int[] dp= new int[n+1];
        System.out.println(fiboM(n, dp));
        System.out.println(fiboT(n));


    }
}
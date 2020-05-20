import java.lang.reflect.Array;
import java.util.*;
class lec24{
    static Scanner scn= new Scanner(System.in);

    public static int largestincsub(int[] arr){
        int[] dp = new int[arr.length];
        dp[0]=1;
        int max=0;
        for(int i=1; i<dp.length; i++){
            dp[i]=1;
            max=0;
            for(int j=0; j<i; j++){
          
                if(arr[i]>arr[j] && dp[j]>max){
                    max= dp[j];
                }
            }
            dp[i]=max+dp[i];
        }
        int ans=0;
        for(int k=0; k<dp.length; k++){
            if(dp[k]>ans){
                ans= dp[k];
            }
        }
        return ans;
    }

    public static int maxsumincsub(int[] arr){
        int[] dp = new int[arr.length];
        dp[0]= arr[0];
       
        for(int i=1; i<dp.length; i++){
            dp[i]= arr[i];
            int max=0;
            for(int j=0; j<i; j++){
                if(arr[i]>=arr[j]){
                    max= Math.max(max,dp[j]);
                }
            }
            dp[i]=max+dp[i];
        }
        int ans=0;
        for(int k=0; k<dp.length; k++){
            if(dp[k]>ans){
                ans= dp[k];
            }
        }
        return ans;
    }

    public static int maxbiosub(int[] arr){
        int[] dp1= new int[arr.length];
        int[] dp2= new int[arr.length];

        dp1[0]=1;
        for(int i=1; i<dp1.length; i++){
            dp1[i]=1;
            int max1=0;
            for(int j=0; j<i; j++){
          
                if(arr[i]>arr[j] && dp1[j]>max1){
                    max1= dp1[j];
                }
            }
            dp1[i]=max1+dp1[i];
        }

        dp2[dp2.length-1]=1;
        for(int i= dp2.length-2; i>=0; i--){
            dp2[i]=1;
            int max2=0;
            for(int j= i+1; j<arr.length; j++){
                if(arr[i]>arr[j] && dp2[j]>max2){
                    max2= dp2[j];
                }
            }
            dp2[i]=max2+dp2[i];
        }
        int max=dp1[0]+dp2[0]-1;;
        for(int k=1; k<dp1.length; k++){
            int ans= dp1[k]+dp2[k]-1;
            if(ans>max){
                max=ans;
            }
        }
        return max;
    }

    public static int countEncoding(String ques){
        
    }
    public static void main(String[] args){
    int n= scn.nextInt();
    // System.out.print(arrangeBuilding(n));
    int[] arr= new int[n];
    for(int i=0; i<n; i++){
        arr[i]= scn.nextInt();
    }
    // System.out.print(maxsumsub(n, arr));
//    System.out.println(largestincsub(arr));
//    System.out.println(maxsumincsub(arr));
   System.out.println(maxbiosub(arr));


  

    }
}
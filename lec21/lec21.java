import java.lang.reflect.Array;
import java.util.*;
class lec21{
    static Scanner scn= new Scanner(System.in);

    public static int countstair(int n){
        int count1=0; int count2=0; int count3=0;
        if(n==0){
            return 1;
        }
        if(n-1>=0){
            count1 = countstair(n-1);
        }
        if(n-2>=0){
            count2 = countstair(n-2);
        }
        if(n-3>=0){
            count3 = countstair(n-3);
        }
        int ans = count1+ count2+ count3;
        return ans;

    }

    public static int sirCountstairs(int n){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        int c1= sirCountstairs(n-1);
        int c2= sirCountstairs(n-2);
        int c3= sirCountstairs(n-3);
        int ans = c1+c2+c3;
        return ans;
    }

    public static int countstairM(int n, int[] dp){
        int count1=0; int count2=0; int count3=0;
        if(n==0){
            return 1;
        }
        if(dp[n] !=0){
            return dp[n];
        }
        if(n-1>=0){
            count1 = countstairM(n-1,dp);
        }
        if(n-2>=0){
            count2 = countstairM(n-2,dp);
        }
        if(n-3>=0){
            count3 = countstairM(n-3,dp);
        }
      
        int ans = count1+ count2+ count3;
        dp[n]=ans;
        return ans;

    }

    public static int sirCountstairsM(int n, int[] dp){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        int c1= sirCountstairsM(n-1,dp);
        int c2= sirCountstairsM(n-2,dp);
        int c3= sirCountstairsM(n-3,dp);
        int ans = c1+c2+c3;
        dp[n]=ans;
        return ans;
    }

    public static int countstairT(int n){
        int[] dp = new int[n+1];
        dp[0]=1;
        for(int i=1; i<=n;i++){
            if(i-1>=0){
                dp[i]+=dp[i-1];
            }
            if(i-2>=0){
                dp[i]+=dp[i-2];
            }
            if(i-3>=0){
                dp[i]+=dp[i-3];
            }
        }
        return dp[n];
    }

    public static int sirCountstairT(int n){
        int[] dp = new int[n+1];
        dp[0]=1;
        for(int i=1; i<=n;i++){
            dp[i]= dp[i-1];
            if(i-2>=0){
                dp[i]+=dp[i-2];
            }
            if(i-3>=0){
                dp[i]+=dp[i-3];
            }
        }
        return dp[n];
    }

    public static int stairpathvariablesteps(int[] arr, int si){
        int count=0;
        if(si== arr.length-1){
            return 1;
        }
        if(si>=arr.length){
            return 0;
        }
        for(int i=1; i<=arr[si]; i++){
            count+= stairpathvariablesteps(arr, si+i);
        }
        return count;

    }

    public static int stairpathvariablestepsM(int[] arr, int si, int[] dp){
        int count=0;
        if(dp[si]!=0){
            return dp[si];
        }
        if(si== arr.length-1){
            return 1;
        }
        if(si>=arr.length){
            return 0;
        }
        for(int i=1; i<=arr[si]; i++){
            count+= stairpathvariablestepsM(arr, si+i,dp);
        }
        dp[si]= count;
        return count;
    }

    public static int stairpathvariablestepsT(int[] arr, int si){
        int[] dp= new int[arr.length];
        dp[arr.length-1]=1;

        for(int i=arr.length-2; i>=0; i--){
            for(int j=1; j<=arr[i]; j++){
                if(i+j<arr.length){
                    dp[i]+= dp[i+j];
                }
            }
        }
        return dp[0];
    }

    public static int mincostpath(int[][] arr, int row, int col){
        int hmc=0; int vmc=0;
        if(row == arr.length-1 && col== arr[0].length-1){
            return arr[row][col];
        }
        if(row+1<=arr.length-1){
            vmc= mincostpath(arr,row+1, col)+ arr[row+1][col];
        }
        if(col+1<=arr[0].length-1){
            hmc= mincostpath(arr,row, col+1)+ arr[row][col+1];
        }
        int fmc= arr[row][col]+ Math.min(hmc, vmc);
        
        return fmc;
    }

    public static int mcp(int[][] arr, int row, int col){
        int hmc=0; int vmc=0;
        if(row == arr.length-1 && col== arr[0].length-1){
            return arr[row][col];
        }
        if(row+1>=arr.length){
            return 0;
        }
        if(col+1>=arr[0].length){
            return 0;
        }
        vmc= mincostpath(arr,row+1, col)+ arr[row+1][col];
        hmc= mincostpath(arr,row, col+1)+ arr[row][col+1];
        int fmc= arr[row][col]+ Math.min(hmc, vmc);
        
        return fmc;
    }

    public static int sirmcp(int[][] arr, int row, int col){
        if(row == arr.length-1 && col== arr[0].length-1){
            return arr[row][col];
        }
        int hc= Integer.MAX_VALUE;
        int vc= Integer.MAX_VALUE;
        if(row+1<arr.length){
            vc= sirmcp(arr,row+1, col);
        }
        if(col+1<arr[0].length){
            hc = sirmcp(arr,row, col+1);
        }
        int ans= Math.min(hc,vc)+ arr[row][col];
        return ans;
    }

    public static int sirmcpM(int[][] arr, int row, int col, int[][] dp){
        if(row == arr.length-1 && col== arr[0].length-1){
            return arr[row][col];
        }
        int hc= Integer.MAX_VALUE;
        int vc= Integer.MAX_VALUE;
        if(dp[row][col]!=Integer.MAX_VALUE){
            return dp[row][col];
        }
        if(row+1<arr.length){
            vc= sirmcpM(arr,row+1, col,dp);
        }
        if(col+1<arr[0].length){
            hc = sirmcpM(arr,row, col+1,dp);
        }
        int ans= Math.min(hc,vc)+ arr[row][col];
        dp[row][col]= ans;
        return ans;
    }

    public static int mcpT(int[][] arr, int row, int col){
        int[][] dp= new int[arr.length][arr[0].length];
        // for(int i=0; i<arr.length; i++){
        //     for(int j=0; j<arr[0].length; j++){
        //         dp[i][j]= Integer.MAX_VALUE;
        //     }
        // }
        dp[arr.length-1][arr[0].length-1]=arr[arr.length-1][arr[0].length-1];
        for(int j=arr[0].length-1; j>=0; j--){
            for(int i=arr.length-1; i>=0; i--){
                if(i==arr.length-1 && j==arr[0].length-1){
                    continue;
                }
                dp[i][j]= arr[i][j];
                if(i+1<arr.length && j+1<arr[0].length){
                    dp[i][j]+=Math.min(dp[i+1][j], dp[i][j+1]);
                }
                else if(i+1<arr.length){
                    dp[i][j]+= dp[i+1][j];
                }
                else if(j+1<arr[0].length){
                    dp[i][j]+=dp[i][j+1];
                }
            }
        }
        return  dp[row][col];
    }
     
    public static int sirmcpT(int[][] arr, int n, int m){
        int[][] dp = new int[n][m];

        for(int col=m-1; col>=0; col--){
            for(int row=n-1; row>=0; row--){
                if(row==n-1 && col==n-1){
                    dp[n-1][m-1]=arr[n-1][m-1];
                }
                else if(col== m-1){
                    dp[row][col]= arr[row][col]+ dp[row+1][col];
                }
                else if(row==n-1){
                    dp[row][col]= arr[row][col]+dp[row][col+1];
                }
                else{
                    dp[row][col]= arr[row][col]+ Math.min(dp[row+1][col],dp[row][col+1]);
                }
            }
        }
        return dp[0][0];
    }
    

    public static void targetsubset(int[] arr, int idx, int ssf, int target, String ans){
        if(idx== arr.length){
            if(target==0){
                System.out.println(ans);
            }
            return;
        }
    
        targetsubset(arr, idx+1,ssf, target, ans);
        targetsubset(arr, idx+1,ssf+arr[idx], target-arr[idx], ans+ arr[idx]+" ");
    }

    public static int target_sum_subset(int[] arr, int idx, int ssf, int target){
        int count =0;
        if(idx== arr.length){
            if(target==0){
               return 1;
            }
            return 0;
        }
        count+=target_sum_subset(arr, idx+1, ssf, target);
        count+=target_sum_subset(arr, idx+1, ssf+arr[idx], target-arr[idx]);

        return count;
    }

    public static boolean is_possible_targetsumsubset(int[] arr, int target){
        int count = target_sum_subset(arr, 0, 0, target);
        return (count>0);
    }

    // public static boolean targetsumsubset_dp(int[] arr,int target){
    //     int[][] dp = new int[arr.length+1][target+1];

    // }

    public static boolean sirTargetsumsubset(int[] arr, int idx, int target){
        if(idx== arr.length){
            if(target==0){
                return true;
            }
            return false;
        }

        boolean result1= sirTargetsumsubset(arr, idx+1, target);
        boolean result2= sirTargetsumsubset(arr, idx+1, target-arr[idx]);

        if(result1==true ||result2==true){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean sirTargetsumsubsetT(int[] arr, int target){
        Boolean[][] dp= new Boolean[arr.length+1][target+1];
        // for(int i=0; i<dp.length; i++){
        //     for(int j=0; j<dp[0].length; j++){
        //         dp[i][j]= false;
        //     }
        // }
        for(int i=0; i<dp.length; i++){
            dp[i][0]= true;
        }
        for(int row=1; row<dp.length; row++){
            for(int col=1; col<dp[0].length; col++){
                dp[row][col]=dp[row-1][col];
                if(dp[row][col]==false && col>=arr[row-1]){
                    dp[row][col]= dp[row-1][col-arr[row-1]];
                }
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }

    

    public static void main(String[] args){
    //    int n= scn.nextInt();
    //    System.out.println(countstair(n));
       
    //    int[] dp = new int[n+1];
    //    System.out.println(countstairM(n, dp));
    
    // int[] arr={2,7,1,3};
    // targetsubset(arr, 0, 0, 10, "");
    
    // int[] arr={3,3,0,2,1,2,4,2,0,0};
    
    // int size= scn.nextInt();
    // int[] arr= new int[size];
    // for(int i=0; i<arr.length; i++){
    //     arr[i]= scn.nextInt();
    // }
    // int[] dp= new int[size+1];
    // System.out.println(stairpathvariablesteps(arr, 0));
    // System.out.println(stairpathvariablestepsM(arr, 0, dp));
    // System.out.println(stairpathvariablestepsT(arr, 0));

    
    // int n = scn.nextInt();
    // int m = scn.nextInt();
    // int[][] arr = new int[n][m];
    // for(int i=0; i<n; i++){
    //     for(int j=0; j<m; j++){
    //         arr[i][j]= scn.nextInt();
    //     }
    // }
    // // System.out.println(mincostpath(arr, 0, 0));
    // // System.out.println(mcp(arr, 0,0));
    // System.out.println(sirmcp(arr, 0, 0));
    // int[][] dp= new int[n+1][m+1];
    // for(int i=0; i<arr.length; i++){
    //     for(int j=0; j<arr[0].length; j++){
    //         dp[i][j]= Integer.MAX_VALUE;
    //     }
    // }
    // System.out.println(sirmcpM(arr, 0, 0, dp));
    // System.out.println(mcpT(arr, 0, 0));
    // System.out.println(sirmcpT(arr, n, m));

    int n = scn.nextInt();
    int[] arr= new int[n];
    for(int i=0; i<n;i++){
        arr[i]= scn.nextInt();
    }
    int target= scn.nextInt();
    // System.out.println(sirTargetsumsubset(arr,0,target));
    // System.out.println(sirTargetsumsubsetT(arr,target));
    targetsubset(arr, 0, 0, target, "");



    }
}
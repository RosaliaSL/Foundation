import java.lang.reflect.Array;
import java.util.*;
class lec23{
    static Scanner scn= new Scanner(System.in);

    public static int arrangeBuilding(int n){
        int[] endS= new int[n+1];
        int[] endB= new int[n+1];

        endS[1]=1;
        endB[1]=1;

        for(int i=2; i<=n; i++){
            endB[i]= endS[i-1];
            endS[i]= endS[i-1]+endB[i-1];
        }
        int ans= endS[n]+endB[n];
        return ans*ans;
    }

    public static int maxsumsub(int n, int[] arr){
        int[] inc= new int[n];
        int[] exc= new int[n];

        inc[0]= arr[0];

        for(int i=1; i<n; i++){
            inc[i]= exc[i-1]+ arr[i];
            exc[i]= Math.max(inc[i-1], exc[i-1]);
        }
        int ans = Math.max(inc[n-1], exc[n-1]);

        return ans;
    }

    // public static int maxsumsubR(int si, int[] arr){
    //     if(si== arr.length){
    //         return 0;
    //     }
    //     //include

    // }

    public static int countEncoding(String ques){
        int[] dp = new int[ques.length()];
        
        int count =0;
        // char ch = ques.charAt(0);
        // int ch1= ch -'0';
        // if(ch1 !=0){
        //     dp[0]=1;
        // }
        // else{
        //     return -1;
        // }
        dp[0]=1;
        
        for(int i=1; i<ques.length(); i++){
            int ch2=ques.charAt(i)-'0';
            int ch3=ques.charAt(i-1)-'0';
            int letter= ch3*10+ch2;

            if(ch2==0 && letter<=26){
                dp[i]= dp[i-1];
                break;
            }
            if(ch2==0){
                dp[i]=0;
                break;
            }
            if(i==2 && letter<=26){
                dp[i]=2;
                break;
            }
            if(i>2 && ch2>0 && (ques.charAt(i-1)-'0')==0){
                dp[i]=dp[i-1];
                break;
            }
            dp[i]= dp[i-1]+dp[i-2];
            

        }
        return dp[ques.length()-1];
    }


    public static void main(String[] args){
    // int n= scn.nextInt();
    // // System.out.print(arrangeBuilding(n));
    // int[] arr= new int[n];
    // for(int i=0; i<n; i++){
    //     arr[i]= scn.nextInt();
    // }
    // System.out.print(maxsumsub(n, arr));
    System.out.print(countEncoding("1123"));

  

    }
}
import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
    public static int[] infected(int[] arr){
       int[] ans = new int[arr.length];
       for(int i = 0; i < ans.length; i++){
           ans[i] = 1;
       }
        for (int i = 0; i < ans.length - 1; i++){
            if( i != 0){
                if (arr[i] - arr[i - 1] <= 2){
                    ans[i] = ans[i - 1];
                }
            }
            if (arr[i + 1] - arr[i] <= 2){
                ans[i] += 1;
            }
            if (arr[i + 2] - arr[i] <=2){
                ans[i] += 1;
                i++;
            }
        }    
       return ans;
    }
    public static int[] infect(int[] arr){
        int[] ans = new int[arr.length];
        for(int i = 0; i < ans.length; i++){
           ans[i] = 1;
        }
        if (arr.length == 2){
            if(arr[1] - arr[0] <= 2){
                ans[0] += 1;
            }
            return ans;
        }
        for(int i = 0; i < arr.length - 1; i++){
            if( i != 0){
                if (arr[i] - arr[i - 1] <= 2){
                    ans[i] = ans[i - 1];
                }
            }
            if (arr[i + 1] - arr[i] <= 2){
                ans[i] += 1;
            }
            if(i < arr.length - 2){
                if (arr[i + 2] - arr[i] <= 2){
                    ans[i] += 1;
                    ans[i + 1] = ans[i];
                    i++;
                }    
            }
        }
        return ans;
    }
    public static int maxArr(int[] arr){
        int max= arr[0];
        for(int i=1; i<arr.length - 1; i++){
            if(arr[i]> max){
                max= arr[i];
            }
        }
    
        return max;
    }
    public static int minArr(int[] arr, int[] ans){
        int min = ans[0];
        for(int i=1; i<arr.length - 1; i++){
            min = ans[i];
            if(arr[i + 1] - arr[i] > 2){
                return min;
            }
        }
        return min;
    }
    public static void input(int[] arr){
        for(int i=0; i<arr.length ; i++){
            arr[i]= scn.nextInt();
        }
    }
    public static void display(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
    static Scanner scn = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
        // your code goes here
        int t = scn.nextInt();
        for (int i = 0; i < t; i++){
            int size = scn.nextInt();
            int[] arr = new int[size];
            input(arr);
            int[] ans = infect(arr);
            int maximum = maxArr(ans);
            int minimum = minArr(arr, ans);
            System.out.println(minimum + " " + maximum);

        }
            // int size = scn.nextInt();
            // int[] arr = new int[size];
            // input(arr);
            // int[] ans = infect(arr);
            // int maximum = maxArr(ans);
            // int minimum = minArr(arr, ans);
            // System.out.println(minimum + " " + maximum);
            // display(ans);
	
		
	}
}
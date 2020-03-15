//first occurence

import java.util.*;
class lec07q3{
    static Scanner scn= new Scanner(System.in);
    public static void input(int[] arr){
        for(int i=0; i<arr.length; i++){
            arr[i]= scn.nextInt();
        }
    }
    public static void display(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }

    public static int maxArr(int[] arr){
        int max= arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]> max){
                max= arr[i];
            }
        }
        return max;
    }

    public static  int binSearchFirst(int[] arr, int data){
        int right = arr.length-1;
        int left = 0;
        int ans =-1;
        
        while(left<=right){
            int mid= (left+right)/2;
            if(arr[mid]== data){
                right= mid-1;
                ans= mid;
            }
            else if(arr[mid]> data){
                right = mid -1;
            }
            else {
                left= mid +1;
            }
        }
        return ans;
    }

    public static int iIntoArrOfI(int[] arr){
        int sum=0;
        int rot=0;
        for(int i=0; i<arr.length; i++){
            sum+= arr[i];
            rot = rot + i*arr[i];
        }
        int mymax=rot;
        for(int i=1; i<arr.length; i++){
            rot = rot - (sum- arr.length*arr[i-1]);
            if(mymax<rot){
                mymax=rot;
            }
        }
        return mymax;
    }

  
public static void main(String[] args){
        int size= scn.nextInt();
        int[] arr= new int[size];
        input(arr);
        // System.out.print(iIntoArrOfI(arr));
        System.out.print(binSearchFirst(arr,3));


    }
}
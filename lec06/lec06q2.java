import java.util.*;
class lec06q2{
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
    public static void reverse(int[]arr, int si, int ei){
        while(si<ei){
            int temp = arr[si];
            arr[si]= arr[ei];
            arr[ei]= temp;
            si++; ei--;
        }
    }

    public static void rotate(int []arr, int r){
        r=r%arr.length;
        if(r<0){
            r= arr.length+r;
        }
        reverse(arr, arr.length-r, arr.length-1);
        reverse(arr, 0, arr.length-r-1);
        reverse(arr, 0, arr.length-1);

    }
public static void main(String[] args){
        int size= scn.nextInt();
        int[] arr= new int[size];
        input(arr);
        int r= scn.nextInt();
        rotate(arr, r);
        display(arr);
        
       
            
      


       
            
            


    }
}
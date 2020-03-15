// Arrays- input, display, maximum element, minimun element, span

import java.util.*;
class lec05q2{
    static Scanner scn = new Scanner(System.in);
    
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

    public static int minArr(int[] arr){
        int min= arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]<min){
                min= arr[i];
            }
        }
        return min;
    }

    public static void spanArr(int[]arr){
        int min= arr[0];
        int max= arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]<min){
                min= arr[i];
            }
            if(arr[i]> max){
                max= arr[i];
            }
        }
        int span= max-min;
        System.out.print(span);

    }
    public static void main(String[] args){

        System.out.println("enter the size of array");
        int size= scn.nextInt();
        int[] arr= new int[size];
        input(arr);
        display(arr);
        System.out.println();
        System.out.println(maxArr(arr));
        System.out.println(minArr(arr));
        spanArr(arr);
        

        
       





    }
}  
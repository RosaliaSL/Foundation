import java.util.*;
class spanArr{
    static Scanner scn= new Scanner(System.in);

    public static void input(int[] arr){
        for(int i=0; i<arr.length; i++){
            arr[i]= scn.nextInt();
        }
    }
    public static void span(int[] arr){
        int max=arr[0], min=arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]> max){
                max= arr[i];
            }
            if(arr[i]< min){
                min= arr[i];
            }
        }
        int ans = max-min;
        System.out.print(ans);
    }
    public static void main(String[] args){
        int size= scn.nextInt();
        int[] arr= new int[size];
        input(arr);
        span(arr);


    }
}
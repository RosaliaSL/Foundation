import java.util.*;
class sumArray{
    static Scanner scn = new Scanner(System.in);
    public static void input(int[] arr){
        for(int i=0; i<arr.length; i++){
            arr[i]= scn.nextInt();
        }
    }

    public static void sumArray(int[] arr1, int[] arr2) {
        int size= arr1.length;
        if(arr2.length>size){
            size= arr2.length;
        }
        size++;
        int[] res = new int[size];
        int i= arr1.length-1;
        int j= arr2.length-1;
        int k= res.length-1;
        
    }

    

    public static void main(String[] args){
        int size= scn.nextInt();
        int[] arr= new int[size];
        input(arr);
    }
}
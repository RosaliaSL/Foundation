import java.util.*;
class searchElement{
    static Scanner scn = new Scanner(System.in);
    public static void input(int[] arr){
        for(int i=0; i<arr.length; i++){
            arr[i]= scn.nextInt();
        }
    }

    public static int binarySearch(int[] arr, int data){
        int left = 0; 
        int right= arr.length;
        int mid;

        while(left<=right){
            mid= (left+right)/2;
            if(arr[mid]==data){
                return mid;
            }
            else if(arr[mid]<data){
                left= mid+1;
            }
            else{
                right= mid-1;
            }
        }
        return -1;
    }

    public static int search(int[] arr, int data){
        for(int i=0; i<arr.length; i++){
            if(arr[i]== data){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int size= scn.nextInt();
        int[] arr= new int[size];
        input(arr);
        int data= scn.nextInt();
        System.out.print(search(arr, data));

    }
}
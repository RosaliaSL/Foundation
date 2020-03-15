import java.util.*;
class lec07q2{
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

    public static  boolean binSearch(int[] arr, int data){
        int right = arr.length-1;
        int left = 0;
        
        while(left<=right){
            int mid= (left+right)/2;
            if(arr[mid]== data){
                return true;
            }
            else if(arr[mid]> data){
                right = mid -1;
            }
            else{
                left= mid +1;
            }
        }
        return false;
    }


  
public static void main(String[] args){
        int size= scn.nextInt();
        int[] arr= new int[size];
        input(arr);
        System.out.print(binSearch(arr,7));


    }
}

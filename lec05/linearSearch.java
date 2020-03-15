import java.util.*;
class linearSearch{
    static Scanner scn= new Scanner(System.in);

    public static void input(int[] arr){
        for(int i=0; i<arr.length; i++){
            arr[i]= scn.nextInt();
        }
    }

    public static boolean binSearch(int[] arr, int n){
        int s= arr.length-1;
        int left = 0;
        int right =s;

        while(left<=right){
        
        int mid = (left+right)/2;

        if(arr[mid]== n){
            return true;
        }
        else if(arr[mid]<n){
            left= mid+1;
        }
        // if(arr[mid]>n)
        else{
            right= mid-1;
        }
    }
    return false;


    }

    public static void Search(int[] arr, int n){
        int i;
        for(i=0; i<arr.length; i++){
            if(arr[i]==n){
                System.out.println("True");
                break;
            }
            
                // System.out.println("False");
            }
            if(i==arr.length)
            {
                System.out.print("False");
            }

    }
    public static void main(String[] args){
        int size= scn.nextInt();
        int[] arr= new int[size];
        input(arr);
        int n= scn.nextInt();
        // Search(arr, n);
        if(binSearch(arr,n)){
        System.out.print("True");
        }
        else{
            System.out.print("false");
        }

    }
}
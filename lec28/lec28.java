import java.lang.reflect.Array;
import java.util.*;
class lec28{
    static Scanner scn= new Scanner(System.in);

    public static void bubblesort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j+1]<arr[j]){
                    int temp=arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void selectionSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

    public static void insertionSort(int[] arr){
        for(int i=1; i<arr.length; i++){
            for(int j=i-1; j>=0; j--){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static int[] merge(int[] arr1, int[] arr2){
        int[] arr= new int[arr1.length + arr2.length];
        int i=0; int j=0; int k=0;

        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                arr[k]=arr1[i];
                i++;
                k++;
            }
            else{
                arr[k]=arr2[j];
                j++;
                k++;
            }
        }
        while(i<arr1.length){
            arr[k]=arr1[i];
            i++;
            k++;
        }
        while(j<arr2.length){
            arr[k]=arr2[j];
            j++;
            k++;
        }
        // for(int x=0; x<arr.length; x++){
        //     System.out.print(arr[x]+" ");
        // }
        return arr;
    }
    public static void main(String[] args){
    int size1= scn.nextInt();
    int[] arr1= new int [size1];
    for(int i=0; i<size1; i++){
        arr1[i]= scn.nextInt();
    }
    int size2= scn.nextInt();
    int[] arr2= new int[size2];
    for(int j=0; j<size2; j++){
        arr2[j]= scn.nextInt();
    }

    int[] arr= merge(arr1, arr2);


    // for(int i=0; i<n; i++){
    //     arr[i]= scn.nextInt();
    // }
    // insertionSort(arr);
   
    for(int x=0; x<arr.length; x++){
        System.out.print(arr[x]+" ");
    }
  }
}
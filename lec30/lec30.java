import java.lang.reflect.Array;
import java.util.*;
class lec30{
    static Scanner scn= new Scanner(System.in);
    public static int[] sortZeroOne(int[] arr){
        int i=0;
        int j= 1;
        while(j<arr.length){
            if(arr[i]>arr[j]){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            if(arr[i]==0){
                i++;
            }
            j++;
        }
        return arr;
    }

    public static int[] sirSortZeroOne(int[] arr){
        int i=0; int j=0;
        // i is starting point of 1's
        // j = inidentified starting point
        while(j<arr.length){
            if(arr[j]==0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
            }
            j++;
        }
        return arr;
    }


    public static void swap(int[] arr, int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    public static int[] sirSort012(int[] arr){
        int i=0; //1's st point
        int j=0; //2's st point
        int k=0; // to iterate

        while(k<arr.length){
            if(arr[k]==0){
                //2's ko shift krenge
                swap(arr,j,k);

                //1's ko shift krenge
                swap(arr, i,j);
                i++; j++;
            }
            else if(arr[k]==1){
                swap(arr, j, k);
                j++;
            }
            k++;
        }
        return arr;
    }

    public static int[] midwaySort(int[] arr){
        int mid = arr[arr.length-1];
        int i=0; int j=0;

        while(j<arr.length - 1){
            if(arr[j]<mid){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
            }
            j++;
        }
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        return arr;
    }


    public static int[] midwaySort2(int[] arr){
        int mid = arr[arr.length-1];
        int i=0; int j=0;

        while(j<arr.length){
            if(arr[j]<=mid){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
            }
            j++;
        }
        return arr;
    }

    public static int partition(int[] arr, int lo, int hi){
        int i=lo, j =lo, pivot = arr[hi];
        while (j<= hi){
            if(arr[j]<=pivot){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
            }
            j++;
        }
        return i-1;
    }

    public static void quickSort(int[] arr, int lo, int hi){
        if(lo >= hi){
            return;
        }
        int pi = partition(arr, lo, hi);
        quickSort(arr, lo, pi-1);
        quickSort(arr, pi+1, hi); 
    }
    public static void main(String[] args){
    // int size1= scn.nextInt();
    // int[] arr1= new int [size1];
    // for(int i=0; i<size1; i++){
    //     arr1[i]= scn.nextInt();
    // }
    // // int size2= scn.nextInt();
    // // int[] arr2= new int[size2];
    // // for(int j=0; j<size2; j++){
    // //     arr2[j]= scn.nextInt();
    // // }

    // int[] arr= mergesort(arr1, 0, arr1.length-1);
   
    // for(int x=0; x<arr.length; x++){
    //     System.out.print(arr[x]+" ");
    // }

    int[] arr={3,5,4,2,3,5,8,6,7,10,8};
    quickSort(arr, 0, arr.length-1);
     for(int x=0; x<arr.length; x++){
        System.out.print(arr[x]+" ");
    }
  }
  
}
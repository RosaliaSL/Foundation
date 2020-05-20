import java.lang.reflect.Array;
import java.util.*;
class lec29{
    static Scanner scn= new Scanner(System.in);

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
        return arr;
    }

    public static int[] mergesort(int[] arr, int low, int high){
        int mid = (low+high)/2;
        if(low==high){
            int[] base= new int[1];
            base[0]=arr[low];
            return base;
        }
        int[] arr1= mergesort(arr, low, mid);
        int[] arr2= mergesort(arr, mid+1, high);
        int[] ans =merge(arr1, arr2);
        return ans;
    }

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
    // public static int[] sort012(int[] arr){
    //     int i=0; int j=1; int k=2;
    //     while(k<arr.length){
    //         if(arr[j]>arr[k]){
    //             int temp=arr[j];
    //             arr[j]=arr[k];
    //             arr[k]=temp;
    //         }
    //         if(arr[i]>arr[j]){
    //             int temp=arr[j];
    //             arr[j]=arr[k];
    //             arr[k]=temp;
                
    //             int temp2=arr[i];
    //             arr[i]=arr[j];
    //             arr[j]=temp2;
    //         }
    //         if(arr[i]==0){
    //             i++;
    //         }
    //         if(arr[j]==1){
    //             j++;
    //         }
    //         k++;
    //     }
    //     return arr;
    // }

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
            if(arr[j]<= mid){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
            }
            j++;
        }
        return arr;
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

    int[] arr={20,5,8,9,11,22,27,18,4,3,7,9};
    arr=midwaySort2(arr);
     for(int x=0; x<arr.length; x++){
        System.out.print(arr[x]+" ");
    }
  }
  
}
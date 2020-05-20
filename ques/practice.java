import java.io.*;
import java.util.*;

public class practice {
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
            if(max<arr[i]){
                max= arr[i];
            }
        }
        return max;
    }

    public static int spanArr(int[] arr){
        int max= arr[0];
        int min= arr[0];
        for(int i=1; i<arr.length; i++){
            if(max<arr[i]){
                max=arr[i];
            }
            if(min>arr[i]){
                min=arr[i];
            }
        }
        return max-min;
    }

    public static void addArr(int[] arr1, int[] arr2){
        int size = arr1.length;
        if(size<arr2.length){
            size= arr2.length;
        }
        size++;
        int[] res= new int[size];
        int i= arr1.length-1;
        int j= arr2.length-1;
        int k= res.length-1;
        int carry=0;

        while(i>=0 && j>=0 && k>=0){
            int num= arr1[i] + arr2[j] + carry;
            carry= num/10;
            num= num%10;
            res[k]=num;
            i--; j--; k--;
        }
        while(i>=0){
            int num= arr1[i] + carry;
            carry= num/10;
            num= num%10;
            res[k]= num;
            i--; k--;
        }
        while(j>=0){
            int num= arr2[j] + carry;
            carry= num/10;
            num=num%10;
            res[k]= num;
            j--; k--;
        }
        if(carry>0){
            res[k]= carry;
            k--;
        }
        for(int x=0; x<res.length; x++){
            if(x==0 && res[x]==0){
                continue;
            }
            System.out.print(res[x]);
        }
    }

    public static int linearSearch(int[] arr, int n){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==n){
                return i;
            }
        }
        return -1;
    }
    
    public static boolean binarySearch(int[] arr, int n){
        int left=0;
        int right = arr.length-1;
        
        while(left<=right){
            int mid = (left+right)/2;
            if(arr[mid]== n){
                return true;
            }
            else if(arr[mid]<n){
                left= mid+1;
            }
            else{
                right= mid-1;
            }
        }
        return false;
    }
    
    public static void reverse(int[] arr, int si, int ei){
        while(si<ei){
            int temp= arr[si];
            arr[si]= arr[ei];
            arr[ei]= temp;
            si++; ei--;
        }
    }
    public static void reverse(int[] arr, int r){
        r=r%arr.length;
        if(r<0){
            r= arr.length+r;
        }
    }

    public static void rotate(int[] arr, int r){
        r=r%arr.length;
        if(r<0){
            r= arr.length+r;
        }
        reverse(arr, 0, arr.length-1);
        reverse(arr, 0, r-1);
        reverse(arr,r, arr.length-1);
    }

    public static int binarySearchFirstOccurence(int[] arr, int data){
        int right= arr.length-1;
        int left =0;
        int ans =-1;
        while(left<=right){
            int mid= (left+right)/2;
            if(arr[mid]== data){
                right= mid-1;
                ans=mid;
            }
            else if(arr[mid]>data){
                right= mid-1;
            }
            else{
                left= mid+1;
            }
        }
        return ans;
    }

    // public static void printSubarr(int[] arr){
        
    // }

    public static int fair_rations(int[] arr){
        int count=0;
        for(int i=1; i<arr.length-1; i++){
            if(arr[i-1]%2==1 && arr[i+1]%2==1){
                arr[i-1]++;
                arr[i]++;
                count+=2;
            }
            if(arr[i]%2==1 && arr[i+1]%2==1){
                arr[i]++;
                arr[i+1]++;
                count+=2;
            }
        }
        boolean ans=true;
        for(int i=0; i<arr.length; i++){
            if(arr[i] %2 !=0){
                ans=false;
                break;
            }
        }
        if(ans==true){
            return count;
        }
        else{
            return -1;
        }
    }


    public static void main(String[] args) {
        // int size1 = scn.nextInt();
        // int[] arr1= new int[size1];
        // input(arr1);
        // int size2 = scn.nextInt();
        // int[] arr2= new int[size2];
        // input(arr2);
        // addArr(arr1, arr2);

        // int n= scn.nextInt();
        // int size = scn.nextInt();
        // int[] arr= new int[size];
        // input(arr);
        // // System.out.print(linearSearch(arr, n));
        // System.out.print(binarySearch(arr, n));

        // int size= scn.nextInt();
        // int[] arr= new int[size];
        // input(arr);
        // int r= scn.nextInt();
        // rotate(arr, r);
        // display(arr);

    //     //Print a pattern of starts
    //     int size= scn.nextInt();
    //     int[] arr= new int[size];
    //     input(arr);
    //     int max= maxArr(arr);

    //     for(int i=max; i>0; i--){
    //         for(int j=0; j<arr.length; j++){
    //             if(arr[j]>=i){
    //                 System.out.print("*\t");
    //             }
                
    //             else{
    //                 System.out.print("\t");
    //             }
    //         }
           
    //  System.out.println();
    //     }

    int size= scn.nextInt();
    int[] arr= new int[size];
    input(arr);

    int ans= fair_rations(arr);

    if(ans==-1){
        System.out.print("NO");
    }
    else{
        System.out.print(ans); 
    }

    }
}
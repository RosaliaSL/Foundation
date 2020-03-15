import java.util.*;
class recursion{

    public static int linearSearch(int[] arr, int target, int i){
        if(i== arr.length){
            return -1;
        }
        int ans= linearSearch(arr, target, i+1);
       if(arr[i]==target){
        return i;
    }
    return ans;   
        
    }
    public static int lastOccurence(int[] arr, int i, int data){
        if(i==arr.length){
            return -1;
        }
        int recAns= lastOccurence(arr, i+1, data);
        if(arr[i]==data){
            return i;
        }
        return recAns;
    }
    public static int firstOccurence(int[] arr, int i, int data){
        if(i==  arr.length){
            return -1;
        }
        if(arr[i]== data){
            return i;
        }
        int ans= firstOccurence(arr, i+1, data);
        return ans;
    }

    public static int preLastOccurence(int[] arr, int i, int data){
        if(i<0){
            return -1;
        }
        if(arr[i]== data){
            return i;
        }
        int ans= preLastOccurence(arr, i-1, data);
        return ans;
    }

    public static int power(int n, int pow){
        if(pow==0){
            return 1;
        }
        int ans = n*power(n, pow -1);
        return ans;
    }
    public static void main(String[] args){
        int[] arr= {1,2,3,3,3,3,3,3,4,5};
        // System.out.print(preLastOccurence(arr, 9, 3));
       System.out.print(linearSearch(arr, 3, 0));

    }
}
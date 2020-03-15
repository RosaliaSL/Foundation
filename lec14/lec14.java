import java.util.*;
class lec14{
    static Scanner scn= new Scanner(System.in);

    public static void toh(int n, String s, String h, String d){
        if(n==0){
            return;
        }
        toh(n-1, s, d, h);
        System.out.println("move "+ n+ "th from "+ s+" to "+d);
        toh(n-1, h, s, d);

    }

    // public static int linearSearch(int[] arr, int target, int i){
    //     if(i==arr.length){
    //         return -1;
    //     }
        
    //     if(arr[i]!= target){
    //         return -1 ;
    //     }
    //     linearSearch(arr, target, i+1);

    // }

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


    
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        // int n= scn.nextInt();
        // toh(4, "source", "helper","destination");
        int[] arr= {1,2,3,4,5,6};
        System.out.print(lastOccurence(arr, 0, 4));
        
        
    }
}

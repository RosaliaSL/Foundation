// Addition of elements in an array

import java.util.*;
class lec05q3{
    static Scanner scn = new Scanner(System.in);
    public static void input(int[] arr){
        for(int i=0; i<arr.length; i++){
            arr[i]= scn.nextInt();
    }
}
public static void addition(int[] arr1,int[] arr2){
    int size = arr1.length;
    if(size<arr2.length){
        size = arr2.length; }
    size++;
    int[] res = new int[size];
    int i = arr1.length-1;
    int j = arr2.length-1;
    int k  =res.length-1;
    int carry = 0;

    while(i>=0 && j>=0 && k>=0){
        int num = arr1[i] + arr2[j] + carry;
        carry = num/10;
        num = num%10;
        res[k] = num;
        i--; j--; k--;
    }
    while(i>=0){
        int num = arr1[i]+carry;
        carry = num/10;
        res[k] = num%10;
        i--; k--;
    }
    while(j>=0){
        int num = arr2[j] + carry;
        carry = num/10;
        res[k] = num%10;
        j--; k--;
    }        
    if(carry>0){
        res[k]= carry;
        k--;
    }

    for(int x=0;x<res.length;x++){
        if( x == 0 && res[x] == 0){
            continue;
        }
            System.out.print(res[x]);
    }
    // display(res);


}
   
    public static void main(String[] args){
        int size1= scn.nextInt();
        int[] arr1= new int[size1];
        // System.out.println();
        int size2= scn.nextInt();
        int[] arr2= new int[size2];
        input(arr1);
        // System.out.println();
        input(arr2);
        addition(arr1, arr2);


       
    }
}  
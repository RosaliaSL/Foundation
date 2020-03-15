// print a pattern of stars according  to the elements present in the array

import java.util.*;
class lec07q1{
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
  
public static void main(String[] args){
        int size= scn.nextInt();
        int[] arr= new int[size];
        input(arr);

        int max= maxArr(arr);
        int copy =max;
        
        for(int i=0; i<copy; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[j]>=max){
                    System.out.print("*\t");
                }
                
                else{
                    System.out.print("\t");
                }
                
                     
            }
            max--;
            System.out.println();
        }
        
        
     
      


       
            
            


    }
}
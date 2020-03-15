import java.util.*;
class lec06q1{
    static Scanner scn= new Scanner(System.in);
    public static void input(int[] arr){
        for(int i=0; i<arr.length; i++){
            arr[i]= scn.nextInt();
        }
    }
public static void main(String[] args){
        int size= scn.nextInt();
        int[] arr= new int[size];
        input(arr);
        
        //reverse
        int copy;
        int s= arr.length;
        // for(int i=0; i<arr.length/2 ; i++){
            
        //     copy= arr[i];
        //     arr[i]= arr[s-1];
        //     arr[s-1]= copy;
        //     i++;
        //     s--;

        // }
        // for(int i=0; i<arr.length; i++){
        //     System.out.print(arr[i]+ " ");
        // }

        // int r= scn.nextInt();
        // int s= arr.length-r;
        // int a=0;

        // for(int i=0; i<r ; i++){
            
        //         copy= arr[i];
        //         arr[i]= arr[arr.length-r+a];
        //         arr[arr.length-r+a]= copy;
        //         a++;
        // }
        // for(int i=r; i<s+r; i++){
        //     copy= arr[i];
        //     int b= arr.length;
        //         arr[i]= arr[b-1];
        //         arr[b-1]= copy;
                
        //         b--;

        // }
        //  for(int i=0; i<arr.length; i++){
        //     System.out.print(arr[i]+ " ");
        // }


       
            
            


    }
}
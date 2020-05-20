import java.util.*;
class lec07q4{
    static Scanner scn= new Scanner(System.in);
    public static void input(int[] arr){
        for(int i=0; i<arr.length; i++){
            arr[i]= scn.nextInt();
        }
    }

    public static void subSets(int[] arr){
        int pow=1;
        for(int i=0; i<arr.length;i++){
            pow=pow*2;
        }
        int count =0;
        while(count<pow){
            int cc= count;
            int length=0;
            while(cc!=0){
                int rem= cc%2;
                cc= cc/2;
                if(rem==1){
                    System.out.print(arr[length]+ " ");
                }
                    length++; 
                }
                
                count ++;
                System.out.println();
            }
            
        }
    
   

    
  
public static void main(String[] args){
        int size= scn.nextInt();
        int[] arr= new int[size];
        input(arr);
        // System.out.print(iIntoArrOfI(arr));
        // System.out.print(binSearchFirst(arr,3));
        subSets(arr);



    }
}
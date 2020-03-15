import java.util.*;
class linearSearch{
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

        int max= INT_MIN;

        for(int i=0; i<arr.length; i++){
        
            for(int j=i; j<arr.length; j++){
                int sum=0;
                for(int k=i; k<=j; k++){
                    sum+=arr[k];
                    if(sum>max){
                        max=sum;
                    }
                }
            
            }
        }

    }
}
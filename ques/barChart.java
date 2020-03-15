import java.util.*;
class barChart{
    static Scanner scn = new Scanner(System.in);
    public static void input(int[] arr){
        for(int i=0; i<arr.length; i++){
            arr[i]= scn.nextInt();
        }
    }

    public static void barChart(int[] arr){
        int max= arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max= arr[i];
            }
        }
        for(int i=max; i>0; i--){
            for(int j=0; j<arr.length; j++){
                if(arr[j]>= i){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int size= scn.nextInt();
        int[] arr= new int[size];
        input(arr);
        barChart(arr);
       

    }
}
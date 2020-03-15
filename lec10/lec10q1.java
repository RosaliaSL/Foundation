import java.util.*;
class lec10q1{
    static Scanner scn= new Scanner(System.in);
    
    public static void fill(int[][] arr){
        int count =1;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                arr[i][j]= count;
                count++;
            }
        }
    }
    public static void display(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print (arr[i][j]+ " ");
               }
               System.out.println();
        }
    }

    public static void rotate(int[][] arr){
        //transpose
        for(int i=0 ; i<arr.length ; i++){
            for(int j=0; j<i; j++){
                int copy1 =arr[i][j];
                int copy2= arr[j][i];
                arr[i][j]= copy2;
                arr[j][i]=copy1;
              
            }
            
        }
        //Swap the rows to obtain final result
        for(int i=0; i<arr.length/2; i++){
            for(int j=0; j<arr.length; j++){
                int copy1 =arr[i][j];
                int copy2= arr[arr.length-1-i][j];
                arr[i][j]= copy2;
                arr[arr.length-1-i][j]=copy1;
            }
        }
    }
       
public static void main(String[] args){
        // int[][] arr= new int[4][4];
        // fill(arr);
        // display(arr);
        int[][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        rotate(arr);
        display(arr);
    }
       

    
}
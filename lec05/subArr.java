import java.util.*;
class subArr{
    static Scanner scn  = new Scanner(System.in);

    public static void input(int[] arr){
        for(int i=0; i<arr.length; i++){
            arr[i]= scn.nextInt();
    }
}

    public static void subtractionArr(int[] arr1, int[] arr2){
        int size= arr1.length;
        int[] res= new int[size];

        int i= arr1.length-1;
        int j= arr2.length-1;
        int k= res.length-1;
       
        
        while(i>=0 && j>=0 && k>=0){
            int borrow=0;
            int num= arr1[i]- arr2[j];
            if(num<0){
                // borrow =10;
                num= num+ 10;
                res[k]= num;
                arr1[i-1]--;
            }
            // res[k]= num+ borrow;
            else{
                res[k]= num;
            }
            i--;
            j--;
            k--;
        }
        while(i>=0){
            
            if(arr1[i]<0){
            res[k]= arr1[i]+10;
            arr1[i-1]--;
            }
            else{
                res[k]= arr1[i];
            }
            
            i--;
            k--;
        }
        for(int x=0; x<res.length; x++){
            // if(x==0 && res[x]==0){
            //     continue;
            // }
            System.out.print(res[x]+ " ");
        }



    }
    public static void main(String[] args){
        int size1= scn.nextInt();
        int[] arr1= new int[size1];
        input(arr1);
        int size2= scn.nextInt();
        int[] arr2= new int[size2];
        input(arr2);

        subtractionArr(arr1, arr2);



    }
}
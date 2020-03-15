import java.util.*;
class lec09q2{
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

    public static void multiply(int[][] arr1, int [][]arr2){
        int[][] ans= new int[arr1.length][arr2.length];
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr1.length; j++){
                for(int k=0; k<arr1.length; k++){
                    ans[i][j]+= arr1[i][k]*arr2[k][j];
                }
            }
        }
        display(ans);
            
}

public static void spiral(int[][] arr){
    int rmin=0; 
    int cmin=0; int count=0;
    int cmax=arr[0].length-1; int rmax=arr.length-1;

    while(count<arr.length*arr[0].length){
    //left wall
    for(int i=rmin; i<=rmax; i++){
       System.out.print(arr[i][cmin]+" ");
       count++;}
       if(count==arr.length*arr[0].length){
        break;
    }
    
    cmin++;
   
    //bottom wall
   for(int i= cmin; i<=cmax; i++){
       System.out.print(arr[rmax][i]+" ");
       count++;}
       if(count==arr.length*arr[0].length){
        break;
    }
    
    rmax--;

    //right wall
    for(int i=rmax; i>=rmin; i--){
     System.out.print(arr[i][cmax]+" ");
     count++;}

   if(count==arr.length*arr[0].length){
           break;
       }
    cmax--;
    //top wall
    for(int i=cmax; i>=cmin; i--){
      System.out.print(arr[rmin][i]+ " ");
        count++;}
        if(count==arr.length*arr[0].length){
            break;
        }
    rmin++;

}
}

public static void exitPoint(int[][] arr){
    int r=0; int c=0;
    int dir=0;

    while(true){
        dir+=arr[r][c];
        dir=dir%4;
        if(dir==0){
            c++;
        }
        else if(dir==1){
            r++;
        }
        else if(dir==2){
            c--;
        }
        else{
            r--;
        }
        if(r<0 ||c<0 || r==arr.length || c== arr[0].length){
            break;
        }
    }
    if(r<0){
        r++;
    }
    if(c<0){
        c++;
    }
    if(r==arr.length){
        r--;
    }
    if(c==arr[0].length){
        c--;
    }

    System.out.println(r+" "+ c);

}



public static void main(String[] args){
        // int[][] arr={{0,0,0,1,0},{1,0,0,0,1},{0,0,0,0,0},{1,0,0,1,0}};
        // // fill(arr);
        // exitPoint(arr);
        // int[][] brr={{0,0,0,1,0},{1,0,0,0,0},{0,0,0,0,0},{1,0,0,1,0}};
        // exitPoint(brr);
        int[][] crr={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
        spiral(crr);
    }
}
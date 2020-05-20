// Backtracking

import java.lang.reflect.Array;
import java.util.*;
class lec18{
    static Scanner scn= new Scanner(System.in);

    public static void oneMaze(int sr, int sc, int er, int ec, int[][] arr, String path){
        if(sr==er && sc==ec){
            System.out.println(path);
            return;
        }
        arr[sr][sc]=1;
        if(sr-1>=0 && arr[sr-1][sc]!=1){
            // arr[sr][sc]=1;
            oneMaze(sr-1, sc, er, ec, arr, path +'U');
            // arr[sr][sc]=0;
        }
        if(sc-1>=0 && arr[sr][sc-1]!=1){
            // arr[sr][sc]=1;
            oneMaze(sr, sc-1, er, ec, arr, path+'L');
            // arr[sr][sc]=0;
        }
        if(sr+1<=er && arr[sr+1][sc]!=1){
            // arr[sr][sc]=1;
            oneMaze(sr+1, sc, er, ec, arr, path+'D');
            // arr[sr][sc]=0;
        }
        if(sc+1<=ec && arr[sr][sc+1]!=1){
            // arr[sr][sc]=1;
            oneMaze(sr, sc+1,er, ec, arr, path+'R');
            // arr[sr][sc]=0;
        }
        arr[sr][sc]=0;
    }

    public static int oneMazeReturn(int sr, int sc, int er, int ec, int[][] arr, String path){
        if(sr==er && sc==ec){
            System.out.println(path);
            return 1; 
        }
        int ans=0;
        arr[sr][sc]=1;
        if(sr-1>=0 && arr[sr-1][sc]!=1){
            ans+=oneMazeReturn(sr-1, sc, er, ec, arr, path +'U');
        }
        if(sc-1>=0 && arr[sr][sc-1]!=1){
            ans+=oneMazeReturn(sr, sc-1, er, ec, arr, path+'L');
        }
        if(sr+1<=er && arr[sr+1][sc]!=1){
            ans+=oneMazeReturn(sr+1, sc, er, ec, arr, path+'D');
        }
        if(sc+1<=ec && arr[sr][sc+1]!=1){
            ans+=oneMazeReturn(sr, sc+1,er, ec, arr, path+'R');
        }
        arr[sr][sc]=0;

        return ans;
    }

    public static void encoding(String ques, String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }
        int ch1= ques.charAt(0)-'0';
        if(ch1==0){
            return;
        }
        char ch= (char)('a'+ ch1-1);
        encoding(ques.substring(1), ans+ch);
        if(ques.length()>1){
            int ch2= ques.charAt(1)- '0';
            int num= ch1*10 +ch2;
            if(num>=10 && num<=26){
                ch= (char)('a'+num-1);
                encoding(ques.substring(2), ans+ch);
            }
        }

       
    }
    public static void main(String[] args){
    //     String path="";
    //     int[][] arr = {{0,0,0,0},
    //                    {0,1,1,0},
    //                    {0,1,0,0},
    //                    {0,0,0,0}};
    //     int[][] arr1= new int [5][5];
    //     arr1[1][3]=1;
    //     arr1[2][0]=1;
    //     arr1[3][2]=1;
    // // oneMaze(0, 0, 3, 3, arr, path);
    // System.out.println(oneMazeReturn(0, 0, 4, 4, arr1, path));
    String ques = scn.nextLine();
    encoding(ques, "");
    

    }
}
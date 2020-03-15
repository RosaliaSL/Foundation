import java.lang.reflect.Array;
import java.util.*;
class lec17{
    static Scanner scn= new Scanner(System.in);

    public static int mazePathUpdatedpath(int sr, int sc, int er, int ec, String path){
        if(sr==er && sc==ec){
            System.out.println(path);
            return 1;
        }
        int ans=0;
        for(int  i=1; i<=er; i++){
            if(sc+i<=ec){
               ans+=mazePathUpdatedpath(sr, sc+i, er, ec, path+'h'+i);
            }
        }
        for(int  i=1; i<=er; i++){
            if(sr+i<=er){
                ans+=mazePathUpdatedpath(sr+i, sc, er, ec, path+'v'+i);
            }
        }
        for(int  i=1; i<=er; i++){
            if(sc+i<=ec && sr+i<=er){
               ans+=mazePathUpdatedpath(sr+i, sc+i, er, ec, path+'d'+i);
            }
        }
        return ans;
    }

    public static ArrayList<String> mazePathSingleMoveArrayList(int sr, int sc, int er, int ec){
        if(sr==er && sc==ec){
            ArrayList<String> baseAns= new ArrayList<>();
            baseAns.add("");
            return baseAns;
        }
        ArrayList<String>  myAns= new ArrayList<>();
        if(sc<ec){
            ArrayList<String> recAns= mazePathSingleMoveArrayList(sr, sc+1, er, ec);
            for(int x=0; x<recAns.size(); x++){
                myAns.add("h"+1+ recAns.get(x));
            }
        }
        if(sr<er){
            ArrayList<String> recAns= mazePathSingleMoveArrayList(sr+1, sc, er, ec);
            for(int  x=0; x<recAns.size(); x++){
                myAns.add("v"+1+ recAns.get(x));
            }
        }
        if(sc<ec && sr<er){
            ArrayList<String> recAns= mazePathSingleMoveArrayList(sr+1, sc+1, er, ec);
            for(int  x=0; x<recAns.size(); x++){
                myAns.add("d"+1+ recAns.get(x));
            }
        }
        return myAns;
    }

    public static ArrayList<String> mazePathMultiMoveArrayList(int sr, int sc, int er, int ec){
        if(sr==er && sc==ec){
            ArrayList<String> baseAns= new ArrayList<>();
            baseAns.add("");
            return baseAns;
        }
        ArrayList<String>  myAns= new ArrayList<>();
        //l1
        for(int i=1; sc+i<=ec;i++){
            ArrayList<String> recAns= mazePathMultiMoveArrayList(sr, sc+i, er, ec);
            for(int x=0; x<recAns.size(); x++){
                myAns.add("h"+i+ recAns.get(x));
            }
        }
        //l2
        for(int i=1; sc+i<=ec && sr+i<=er;i++){
            ArrayList<String> recAns= mazePathMultiMoveArrayList(sr+i, sc+i, er, ec);
            for(int  x=0; x<recAns.size(); x++){
                myAns.add("d"+i+ recAns.get(x));
            }
        }
        //l3
        for(int i=1; sr+i<=er;i++){
            ArrayList<String> recAns= mazePathMultiMoveArrayList(sr+i, sc, er, ec);
            for(int  x=0; x<recAns.size(); x++){
                myAns.add("v"+i+ recAns.get(x));
            }
        }
        return myAns;
    }


    public static ArrayList<String> stairPathReturn(int n){
        if(n==0){
            ArrayList<String> baseAns= new ArrayList<>();
            baseAns.add("");
            return baseAns;
        }
        ArrayList<String>  myAns= new ArrayList<>();
        if(n-1>=0){
            ArrayList<String> recAns=stairPathReturn(n-1);
            for(int i=0; i<recAns.size();i++){
                myAns.add(1+recAns.get(i));
            }
            // for(String str: recAns){
            //     myans.add("1"+str);
            // }
        }
        if(n-2>=0){
            ArrayList<String> recAns=stairPathReturn(n-2);
            for(int i=0; i<recAns.size();i++){
                myAns.add(2+recAns.get(i));
            }
        }
        if(n-1>=0){
            ArrayList<String> recAns=stairPathReturn(n-3);
            for(int i=0; i<recAns.size();i++){
                myAns.add(2+recAns.get(i));
            }
        }
        return myAns;
    }
    

    public static void main(String[] args){
        // System.out.println(mazePathUpdatedpath(0, 0, 2, 2, ""));
        // System.out.println(mazePathMultiMoveArrayList(0, 0, 2, 2));
        // System.out.println(stairPathReturn(7));
        System.out.print(mazePathSingleMoveArrayList(0, 0, 2, 2));
}
}
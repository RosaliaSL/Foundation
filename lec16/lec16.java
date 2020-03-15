import java.lang.reflect.Array;
import java.util.*;
class lec16{

public static void phoneKeys(String[] arr, String ques, String ans){
    if(ques.length()==0){
        System.out.print(ans+" ");
        return;
    }
    int num=  ques.charAt(0)-'0';
    String word= arr[num];
    char ch= word.charAt(0);
    String roq= ques.substring(1);

    for(int i=0; i<word.length(); i++){
    phoneKeys(arr,roq, ans+word.charAt(i));
}
}

public static ArrayList<String> phoneKeysReturn(String[] arr, String ques){
    if(ques.length()==0){
        ArrayList<String> base= new ArrayList<>();
        base.add("");
        return base;
    }
    String roq= ques.substring(1);
    ArrayList<String> recAns= phoneKeysReturn(arr, roq);
    ArrayList<String> myans= new ArrayList<>();
    int num=  ques.charAt(0)-'0';
    String word= arr[num];
   
    for(int i=0; i<recAns.size(); i++){
    for(int j=0; j<word.length(); j++){
        char ch= word.charAt(j);
        myans.add(ch+ recAns.get(i));
    }
}
   return myans;
}

public static ArrayList<String> sirPhoneKeysReturn(String[] arr, String ques){
    if(ques.length()==0){
        ArrayList<String> base= new ArrayList<>();
        base.add("");
        return base;
    }
    String roq= ques.substring(1);
    ArrayList<String> recAns= phoneKeysReturn(arr, roq);
    ArrayList<String> myans= new ArrayList<>();
    int num=  ques.charAt(0)-'0';
    String word= arr[num];
   
    for(int i=0; i<word.length(); i++){
        char ch= word.charAt(i);
        for(int j=0; j<recAns.size(); j++){
        myans.add(ch+ recAns.get(j));
    }
}
   return myans;
}

public static int exitMaze(int sr, int sc, int er, int ec, String path){

    if( sr==er && sc==ec){
        System.out.println(path);
        return 1;
    }
    int ans=0;
    if(sr<er){
       ans+= exitMaze(sr+1, sc, er, ec, path+'v');
    }
    if(sc<ec){
       ans+= exitMaze(sr, sc+1, er, ec, path+'h');
    }
    return  ans;
}




public static void main(String[] args){
    // String[] keypad={" .",";,","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    // ArrayList<String> ans= sirPhoneKeysReturn(keypad, "852");
    // System.out.println(ans);
    System.out.print(exitMaze(0, 0, 2, 2, ""));

 
    



    
    
    
    }
}
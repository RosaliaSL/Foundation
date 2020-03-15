import java.lang.reflect.Array;
import java.util.*;
class lec15{

    public static int[] alloc(int[] arr, int data, int i, int count){
        if(i== arr.length){
            int[] baseans= new int[count];
            return baseans;
        }
        if(arr[i]== data){
            count++;
        }
        int[] recans = alloc(arr, data, i+1, count);
        if(arr[i]==data){
            recans[count-1]=i;
        }
        return recans;
 }

 public static void subseq(String ques, String ans){
     if(ques.length()==0){
         System.out.println(ans);
         return;
     }
     char ch= ques.charAt(0);
     String roq= ques.substring(1);
     subseq(roq, ans+ch);
     subseq(roq, ans);

 }

 public static ArrayList<String> subseq(String ques){
     if(ques.length()==0){
         ArrayList<String> base= new ArrayList<>();
         base.add("");
         return base;
     }
     String roq= ques.substring(1);
     ArrayList<String> recAns= subseq(roq);
     ArrayList<String> myans= new ArrayList<>();
     char ch= ques.charAt(0);
     for(int i=0; i<recAns.size(); i++){
         myans.add(ch+ recAns.get(i));
     }
     for(int i=0; i<recAns.size(); i++){
        myans.add(recAns.get(i));
    }
    return myans;
 }

 public static void srishtiStairPath(int steps, String ans){
     if(steps==0){
        //  ans= ans + ans.charAt(0);
        System.out.println(ans);
     
        return;

     }
     if(steps<0){
         return;
     }
  
    srishtiStairPath(steps-1, ans+"1");
    srishtiStairPath(steps-2, ans+"2");
    srishtiStairPath(steps-3, ans+"3");
    
 }

 public static void sirStairsPath(int n, String path){
     if(n==0){
         System.out.println(path);
         return;
     }
     if(n-1>=0)
     sirStairsPath(n-1, path+"1");
     if(n-2>=0)
     sirStairsPath(n-2, path+"2");
     if(n-3>=0)
     sirStairsPath(n-3, path+"3");
 }

     public static void main(String[] args){
        // int[] arr= {3,5,2,3,5,6,3,2};
        // int[] ans= alloc(arr, 3, 0, 0);
        // for(int i=0; i<ans.length; i++){
        //     System.out.print(ans[i]+" ");
        // }
    //  subseq("abc", "");
    
    // ArrayList<String> ans= subseq("abc");
    // System.out.println(ans);
    // }

    srishtiStairPath(4, "");
}
}
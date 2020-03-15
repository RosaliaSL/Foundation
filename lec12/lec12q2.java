import java.util.*;
class lec12q2{
    static Scanner scn= new Scanner(System.in);

    public static String toggle(String str){
        
        String ans="";
        for(int i =0; i<str.length(); i++){
            char  ch= str.charAt(i);
            //int ch1= str.charAt(i);
            //System.out.println(ch1);

            if(ch>='a'&& ch<='z'){
                ch=(char)(ch-'a'+'A');
            }
            else{
                ch= (char)(ch-'A'+'a');
            }
            ans= ans+ch;
        }
        return ans;
    }
    
    public static void main(String[] args){
        
    // String str= "abcd";
    // char str1='z';
    // // int b=2;
    // // String str2= str1+2;
    // int ans= str1+2;

    // String str= "aBcD";
    // String ans="";

    // for(int i=0; i<str.length; i++){
    //    char ch= str.charAt(i);
    //    int()ch= ch1;
    //    if(65<=ch1<=91){
    //        ch= ch+32;
    //    }
    //    else if(97<=ch1<=123){
    //        ch=ch-32;
    //    }
    //    ans= ans+ch;
    // }
    
    System.out.print(toggle("aBcD"));

}
}
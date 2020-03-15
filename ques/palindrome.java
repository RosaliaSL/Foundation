import java.util.*;
class palindrome{
    static Scanner scn= new Scanner(System.in);

    public static void substr(String str){
        for(int i=0; i<str.length(); i++){
            for(int j=i+1; j<=str.length(); j++){
                {
                    System.out.print(str.substring(i,j)+" ");
                }
                System.out.println();
            }
        }
    }

    public static void palindromeSubstr(String str){
        for(int i=0; i<str.length(); i++){
            for(int j=i+1; j<=str.length(); j++){
                String substr = str.substring(i,j);
                   if(palindrome(substr)==true){
                       System.out.print(substr+" ");
                   }
                
                
            }
        }
    }

    public static boolean palindrome(String str){
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)!= str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }

    public static void stringNum(String str){
        for(int i=0; i<str.length()-1; i++){
            System.out.print(str.charAt(i));
            int num= str.charAt(i+1)- str.charAt(i);
            System.out.print(num);
        }
        System.out.print(str.charAt(str.length()-1));
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        // System.out.print(palindrome(str));
        palindromeSubstr(str);
        // stringNum(str);
    }
}

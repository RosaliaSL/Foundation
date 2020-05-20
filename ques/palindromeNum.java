import java.util.*;
class palindromeNum{

    public static int reverse(int n){
        int reverse =0;
        int lastDigit=0;
        while(n>0){
            lastDigit=n%10;
            n=n/10;
            reverse = lastDigit + reverse*10;}
    
        return reverse;
    }

    public static int palindrome(int n){
        boolean found = false;
        int testNum = n+1;
        int reverseNum=0;
        while(found == false){
            reverseNum = reverse(testNum);
            if(reverseNum== testNum){
                found= true;
                break;
            }
            else{
                testNum++;
            }
        }
        return reverseNum;
    }
    public static void main(String[] args){
        System.out.print(palindrome(101));
    }
}
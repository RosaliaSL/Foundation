import java.util.*;
class anyBaseSub{
    public static int getDifference(int b, int n1, int n2){
        boolean isSwapped= false;
        if(n1>n2){
            isSwapped= true;
            int temp =n1;
            n1= n2;
            n2= temp;
        }
        int ans=0;
        int borrow=0;
        int pow=1;
        int rem=0;
        while(n2!=0){
            rem = (n2%10) - (n1%10) - borrow;
            n2/=10; n1/=10;
            if(rem<0){
                rem= rem+b;
                borrow=1;
            }
            else{
                borrow=0;
            }
            ans= ans+ rem*pow;
            pow= pow*10;
        }
        if(isSwapped){
            ans= -ans;
        }
        return ans;
     
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
    
        int d = getDifference(b, n1, n2);
        System.out.println(d);
    }
}
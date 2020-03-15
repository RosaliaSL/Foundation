import java.util.*;
class lec05q1{

    public static int octalSub(int n1, int n2){
        int ans=0;
        int pow=1;
        int borrow=0;
        int rem=0;
        if(n1>n2){
            while(n2!=0){
                int rem1= n1%10; n1= n1/10;
                int rem2= n2%10; n2=n2/10;

                if(rem1>rem2){
                    rem= rem1-rem2;
                    ans= ans+ rem*pow;
                }
                else{
                    borrow= 8+ rem1;
                    n1= n1-1;
                    rem= borrow- rem2;
                    ans= ans+ rem*pow;
                }
                pow= pow*10;
            }
         ans= n1*pow + ans;
        }
        return ans;
    }

    public static int SirOctalSub(int n1, int n2){
        boolean isSwapped= false;
        if(n2>n1){
            isSwapped= true;
            int temp =n1;
            n1= n2;
            n2= temp;
        }
        int ans=0;
        int pow=1;
        int borrow=0;

        while(n1!=0){
            int r1= n1%10; n1/=10;
            int r2= n2%10; n2/=10;
            int octet = r1-r2 - borrow;
            if(octet<0){
                octet+=8;
                borrow=1;
            }
            else{
                borrow=0;
            }
            ans= ans + octet*pow;
            pow*=10;
        }
        if(isSwapped){
            ans= -ans;
        }
        return ans;
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println(octalSub(623, 325));
        System.out.println(SirOctalSub(623, 325));

       
       





    }
}  
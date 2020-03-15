import java.util.*;

class anyBaseToAnyBase{
    public static int getValueIndecimal(int n, int b){
        int ans=0;
        int rem=0;
        int pow=1;
        while(n!=0){
            rem=n%10;
            n=n/10;
            ans= ans + rem*pow;
            pow*=b;
        }
        return ans;
     }

     public static int getValueInBase(int n, int b){
        int rem=0;
        int pow=1;
        int ans=0;
        while(n!=0){
            rem=n%b;
            n=n/b;
            ans= ans+rem*pow;
            pow*=10;
        }
        return ans;
     }
     public static int getValue(int n, int b1, int b2){
        int inter= getValueIndecimal(n, b1);
        int ans= getValueInBase(inter, b2);

        return ans;
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b1 = scn.nextInt();
        int b2 = scn.nextInt();
    
        int d = getValue(n, b1, b2);
        System.out.println(d);
    }
}
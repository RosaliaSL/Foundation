//Functions and number system

import java.util.*;
class lec04q4{

    public static void decToBin(int n){
        int rem=0;
        int pow=1;
        int ans=0;

        while(n>0){
            rem= n%2;
            n=n/2;
            ans = ans + rem*pow;
            pow=  pow*10;
            
        }
        System.out.print(ans);
    }

    public static void decToOct(int n){
        int ans=0;
        int rem=0;
        int pow=1;

        while(n!=0){
            rem=n%8;
            n=n/8;
            ans= ans+ rem*pow;
            pow*=10;

        }
        System.out.println(ans);
    }

    public static int decToAnybase(int n, int b){
        int ans=0;
        int rem=0;
        int pow=1;

        while(n!=0){
            rem=n%b;
            n=n/b;
            ans= ans+ rem*pow;
            pow*=10;

        }
        return ans;
    }

    public static int AnybasetoDec(int n, int b){
        int ans=0;
        int rem=0;
        int pow=1;

        while(n!=0){
            rem=n%10;
            n=n/10;
            ans= ans+ rem*pow;
            pow*=b;

        }
        return ans;

    }

    public static int AnybaseToAnybase(int n, int sb, int db){
        int abd= AnybasetoDec(n, sb);
        int ans= decToAnybase(abd, db);
        return ans;
    }

    

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        int sb= scn.nextInt();
        int db= scn.nextInt();
        int ans=AnybaseToAnybase(n, sb, db);

        // int n= scn.nextInt();
        
    
        // System.out.println();
        
        // System.out.print(decToAnybase(64, 2));
        // System.out.println();
        // System.out.print(AnybasetoDec(1000, 2));

        System.out.print(ans);

    
    
    
    }
}
// Reverse of a number

import java.util.*;
class lec02q4{
    public static void main(String[] args){

        Scanner scn= new Scanner(System.in);

        int n= scn.nextInt();

        int a;
        a=n;

        int digits=0;

        while(a>0){
            digits++ ;
            a=a/10;

        }
        
        int ans=0;
        while(n>0){
            int rem=0;
            rem = n%10;
            double power=Math.pow(10, digits-1);
            ans+= rem * power ;
            digits--;
            n=n/10;
            

        }

        /*better method

        int ans=0;
        while(n!=0){
            int rem= n%10;
            n=n/10;
            ans=(ans*10)+rem;
        }
        */

        System.out.print(ans);


    }
}


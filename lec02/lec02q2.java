//printing the prime numbers upto n

import java.util.Scanner;
class lec02q2{

    public static void main(String[] args){
         Scanner scn= new Scanner(System.in);

         int n= scn.nextInt();

         for(int i=2; i<n; i++){

            boolean isprime = true;
            
           for(int j=2; j*j<=i; j++){
            if(i%j==0){
                isprime=false;
                break;
            }
           }
        
            if(isprime==true){
                System.out.println(i);
                }
            
        }
    }
}

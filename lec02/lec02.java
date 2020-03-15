// If prime using loops

import java.util.Scanner;

class lec02{

    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);

        int n= scn.nextInt();

        // for(int i=1; i<=10; i++){
        //     System.out.println(i*n);
        // }

        // int i=1;

        // while(i<=10){
        //    System.out.println(i*n);
        //    i++;
       
        if(n==2){
            System.out.print("Prime");
        }
        int i;

        for( i=2; i<n; i++){
            if(n%i==0){
                System.out.print("not prime");
                break;
            }
            
        }
        if(i==n)
        {
            System.out.println("Prime");
        }

        }

    }

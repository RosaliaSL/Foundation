//count the number of digits

import java.util.Scanner;
class lec02q3{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int n= scn.nextInt();
        int digits=0;

        while(n>0){
            digits++ ;
            n=n/10;

        }
        System.out.print(digits);
    }
}
//Diamond pattern

import java.util.Scanner;
class lec03q3{
    public static void main( String[] args){
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();

        int st=1;
        int sp=n/2;

        for(int cr=1; cr<=n; cr++){
            for(int csp=1; csp<=sp; csp++){
                System.out.print("\t");
            }
            for(int cst=1; cst<=st; cst++){
                System.out.print("*\t");
            }
            if(cr<=n/2){
                sp--; 
                st=st+2;
            }
            else{
                sp++;
                st=st-2;
            }

            System.out.println();

        }

        
    
    
    }

}
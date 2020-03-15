//Pascal Triangle pattern

import java.util.*;
class lec04q3{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();

        for(int cr=0; cr<n; cr++){
            int ncr = 1;
            for(int cc=0; cc<=cr; cc++){
                System.out.print(ncr+ "\t");
                int ncrp1= (ncr*(cr-cc))/(cc+1);
                ncr= ncrp1;
            }
            System.out.println();
        }
    }
}
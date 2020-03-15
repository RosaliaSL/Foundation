import java.util.Scanner;
class lec03q2{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();

        // for(int i=1; i<=n; i++){

        //     for(int space=0; space<i; space++){
        //         // System.out.print("  ");
        //         System.out.print("\t");
        //     }

        //     for(int j=n; j>=i; j--){
        //         // System.out.print("* ");
        //         System.out.print("*\t");
        //     }

        //     System.out.println();

        // }
        

        // pattern 2
        int st=n;
        int sp=0;
        for(int cr=1;cr<=n;cr++){
            for(int csp=1;csp<=sp;csp++){
                System.out.print("\t");
            }
            for(int cst=1;cst<=st;cst++){
                System.out.print("*\t");
            }
            st--;
            sp++;
            System.out.println();
        }

    }
}
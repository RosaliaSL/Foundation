import java.util.Scanner;
class lec04q2{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int a=0;
        int b=1;
        int c=a+b;

        int n= scn.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
            if(i==1){
                System.out.print(a+" ");
            }
            else if(i==2 && j==1){
                System.out.print(b+" ");
            }
            else{
                System.out.print(c+ " ");
                a=b;
                b=c;
                c=a+b;
            }
          
        }
        System.out.println();

        }
    }
}
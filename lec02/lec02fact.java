import java.util.Scanner;
class lec02fact{
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);

        int n= scn.nextInt();
        int fact=1;

        for(int i=n; i>0; i--){
            fact= fact*i;
            
        }
        System.out.print(fact);
    }
}
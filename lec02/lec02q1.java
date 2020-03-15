import java.util.Scanner;
class lec02q1{
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);

        int n= scn.nextInt();

        boolean isprime = true;

        // for(int i=2; i<=n; i++){
        //     if(n%i==0){
        //         isprime=false;
        //         break;
        //     }
        // }

        // for(int i=2; i<=n/2; i++){
        //     if(n%i==0){
        //         isprime=false;
        //         break;
        //     }
        // }

        for(int i=2; i*i<=n; i++){
            if(n%i==0){
                isprime=false;
                break;
            }
        }

        if(isprime=true){
        System.out.print("Prime");
        }
        else{
            System.out.print("Not prime");
        }







    }
}
import java.util.*;
class lec02q5{
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        
        int n= scn.nextInt();
        int copy =n;
        int r= scn.nextInt();
        int ans=0;
        int rem=0;
        int suf=0;
        
        int digits=0;
        while(copy>0){
            digits++ ;
            copy=copy/10;
        }
        int mul=digits-r;

        int power =1;
        // for(int i=0; i<digits; i++){
        //     power= power*10;
        // }
        
        while(r>0){
            rem = n%10;
            n=n/10;
            ans= ans + rem*power;
            power*=10;
            r--;
           
        }
       

        for(int i=1; i<=(mul); i++){
                ans= ans*10;
             }
        
        ans= ans+n;
        System.out.println(ans);

        
    }
}
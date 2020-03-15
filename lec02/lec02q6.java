import java.util.*;
class lec02q6{
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        int n= scn.nextInt();

        int rem=0;
        int ans=0;
        int count =0;
        

        while(n>0){
            rem= n%10;
            n=n/10;
            ans+= count* Math.pow(10, rem);
            count++;
        }

        System.out.println(ans);
    }
}
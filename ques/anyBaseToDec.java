import java.util.*;

class anyBaseToDec{
    public static int getValueIndecimal(int n, int b){
        int ans=0;
        int rem=0;
        int pow=1;
        while(n!=0){
            rem=n%10;
            n=n/10;
            ans= ans + rem*pow;
            pow*=b;
        }
        return ans;
     }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int d = getValueIndecimal(n, b);
        System.out.println(d);
    }
}
import java.util.*;
class anyBaseMul{
public static int getSum(int b,int n1, int n2){
    int carry=0;
    int pow=1;
    int ans=0;
     while(n1!=0 || n2!=0){
        int sum= n1%10 + n2%10 + carry;
        n1=n1/10;
        n2=n2/10;
        carry= sum/b;
        sum= sum%b;
        ans= ans+ sum*pow;
        pow=pow*10;
        }
        ans= ans+ carry*pow;
        return ans;
}

public static int getSingleDigitProduct(int b, int n1, int n2){
    int ans=0; int pow=1; int carry=0; int prod=0;
    while(n1!=0){
        prod= (n1%10)*(n2%10)+ carry;
        n1=n1/10;
        carry= prod/b;
        prod=prod%b;
        ans= ans + prod*pow;
        pow=pow*10;
    }
    ans= ans+ carry*pow;
    return ans;
}
    
public static int getProduct(int b, int n1, int n2){
    int ans=0; int mul=1; int copy= n1; int ans1=0; 
    while(n2!=0){
    int rem= n2%10;
    ans1= getSingleDigitProduct(b, copy, rem);
    ans= getSum(b, ans, ans1);
    copy= copy*10;
    n2=n2/10;
}
return ans;
    }
    
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int d = getProduct(b, n1, n2);
        System.out.println(d);
     
    }
}

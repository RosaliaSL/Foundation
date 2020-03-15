import java.util.*;
class anyBaseAdd{
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
   
    public static void main(String[] args){
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getSum(b, n1, n2);
      System.out.println(d);
    }
}
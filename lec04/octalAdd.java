import java.util.*;
class practice{
public static int OctalAdd(int n1, int n2){
    int ans=0;
    int carry=0;
    int power=1;

    while(n1 != 0 || n2!=0){
        int rem = n1%10+ n2%10+ carry;
        n1=n1/10;
        n2=n2/10;
        carry= rem/8;
        ans= ans+ (rem%8)*power;
        power = power*10;
    }
    ans= ans+ carry*power;

    return ans;
}
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        // int n1= scn.nextInt();
        // int n2= scn.nextInt();
        // int ans =0;
        // int carry =0;
        // int rem=0;
        // int rem1=0;
        // int rem2=0;
        // int pow=1;
        
        // while(n1!=0 && n2!=0){
        //     rem1= n1%10;
        //     rem2=n2%10;
        //     rem= carry +rem1+ rem2;
            
        //     if(rem>=8 && n1>9 && n2>9){
        //         rem= rem%8;
        //         carry= rem/8;
        //         ans= ans+ rem*pow;
        //     }
        //     else{
        //         ans= ans+ rem*pow;
        //     }
            
            
        //     n1= n1/10;
        //     n2= n2/10;
        //     // rem= carry;
        //     // // rem=0;
        //     // carry=0;
        //     pow=pow*10;
        // }

         System.out.print(OctalAdd(365, 623));





    }
}  
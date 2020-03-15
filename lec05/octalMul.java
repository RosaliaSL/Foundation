import java.util.*;
class octalMul{

    static Scanner scn = new Scanner(System.in);

    public static int octalMul(int n1, int n2){
        int ans=0;
        int carry =0;
        int rem=0;
        int mul=0;
        int cn1= n1;
        int power =1;
        while(n1!=0){
            while(cn1!=0)
            rem1= cn1%10;
            cn1= cn1/10;
            rem2= n2%10;
            // n2= n2/10;
            int num= (rem1*rem2+ carry)%8;
            carry = (rem1*rem2)/8;
            ans= ans+ num*power;
        }
    }
    public static void main(String[] args){

    }
}
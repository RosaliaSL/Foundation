import java.util.*;
class lec08q1{
    static Scanner scn= new Scanner(System.in);
    public static void input(int[] arr){
        for(int i=0; i<arr.length; i++){
            arr[i]= scn.nextInt();
        }
    }

    public static void printSubArr(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                for(int k=i; k<=j; k++){
                    System.out.print(arr[k]+ " ");
                }
                System.out.println();
            }
        }
    }

    public static void maxSumSubArr(int[] arr){
        int csum=0;
        int msum=0;
        int si=0, ei=0, temp=0;

        for(int i=0; i<arr.length; i++){
            csum+=arr[i];

            if(csum>msum){
                msum= csum;
                ei=i;
                si=temp;
            }
            if(csum<0){
                csum=0;
                temp= i+1;
            }
         }
         System.out.println(msum);
         for(int j=si; j<=ei; j++){
             System.out.print(arr[j]+" ");
         }
         
    }

    public static void SirKadane(int[] arr){
        int cmax=0, omax=0, os=0, oe=0, cs=0, ce=0;
        for(int i=0; i<arr.length; i++){
            cmax+=arr[i];
            if(cmax>omax){
                omax= cmax;
                os=cs;
                oe=ce;
            }
            if(cmax<0){
                cmax=0;
                cs=i+1;
            }
            ce++;
        }
        System.out.println(omax);
        for(int j=os; j<=oe; j++){
            System.out.print(arr[j]+" ");
        }
    }

    public static void SirKadane2(int[] arr){
        int os=0,oe=0, om=0;
        int cs=0, ce=0, cm=0;
        
        while(ce<arr.length){
            if(cm>0){
                cm=cm+arr[ce];
            }
            else{
                cm=arr[ce];
                cs=ce;
            }

            if(om<cm){
                om= cm;
                os=cs;
                oe=ce;
            }
            ce++;
        }
        System.out.println(om);
        for(int j=os; j<=oe; j++){
            System.out.print(arr[j]+" ");
        }
    }
    public static void main(String[] args){
        int size= scn.nextInt();
        int[] arr= new int[size];
        input(arr);
        // printSubArr(arr);
        SirKadane2(arr);
    }
}
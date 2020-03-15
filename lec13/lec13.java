import java.util.*;
class lec13{
    static Scanner scn= new Scanner(System.in);

    public static void p1(int x){
        if(x==0){
            return;
        }
        System.out.println(x);
        p1(x-1);
    }

    public static void p2(int x){
        if(x==0){
            return;
        }
        p2(x-1);
        System.out.println(x);

    }

    public static void p3(int x){
        int copy=x;
        if(x==1){
            System.out.println(x);
           return;
        }
        System.out.println(x);
        p3(x-1);
        System.out.println(x);
    }

    public static void pattern(int x){
        if(x<=0){
            System.out.println(x);
            return;
        }
        System.out.println(x);
        pattern(x-2);
        System.out.println(x-1);
    }

    public static void oddEven(int x){
        if(x==0){
            System.out.println(x);
            return;
        }
        if(x%2==0){
            System.out.println(x);
        }
        oddEven(x-1);
        if(x%2==1){
            System.out.println(x);
        }
    }

    public static int fact(int x){
        int ans;
        if(x==1){
            return 1;
        }
        ans = x*fact(x-1);
        return ans;
    }
    
    // public static int factorial(int x){
    //     int factorial;
    //     if(x==1){
    //         return 1;
    //     }
    //     factorial = x*factorial(x-1);
    //     return factorial;
    // }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        // p3(n);       
        // System.out.print(fact(n)); 
        pattern(n);
        // oddEven(n);
    }
}

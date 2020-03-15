import java.io.*;
import java.util.*;

public class practice {
    static Scanner scn= new Scanner(System.in);

    public static void main(String[] args) {
        int n = scn.nextInt();
        
        boolean isprime= true;
        for(int i=2; i*i<n; i+=2){
            if(n%i==0){
                System.out.print("Prime");
                isprime= false;
                break;
            }
        }
        
        if(isprime==true){
            System.out.print("Not Prime");
        }
        
    }
}
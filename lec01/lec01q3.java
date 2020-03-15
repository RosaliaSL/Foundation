//If else statements

import java.util.Scanner;
class lec01q3{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter your marks:");
        int marks= scn.nextInt();

        if(marks>90){
           System.out.println("Excellent");

        }
        else if(marks >80 && marks <=90){
            System.out.println("Very Good");
        }
        else if(marks >70 && marks <= 80){
            System.out.println("Good");
        }
        else if(marks>60 && marks <=70){
            System.out.println("Avg");
        }
        else{
            System.out.println("poor");
        }
    }
}

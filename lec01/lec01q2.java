import java.util.Scanner;
class lec01q2{
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);

        System.out.println("enter amount:");
        int amount = scn.nextInt();
        System.out.println("enter rate:");
        int rate = scn.nextInt();
        System.out.println("Enter time:");
        int time = scn.nextInt();

        int si= (amount* rate * time)/100;
        System.out.println("Simple interest is:"+ si);

    }
}
                     
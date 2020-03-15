import java.util.*;
class digitFrequency{
    static Scanner scn = new Scanner(System.in);

    public static int freq(int n, int d){
        int rem=0;
        int count =0;
        while(n!=0){
            rem= n%10;
            n=n/10;
            if(rem == d){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){

        int n= scn.nextInt();
        int d= scn.nextInt();
        
        System.out.print(freq(n,d));

    }
}


// Online Editor

// import java.util.*;
  
//   public class Main{
  
//   public static void main(String[] args) {
//       Scanner scn = new Scanner(System.in);
//       int n = scn.nextInt();
//       int d = scn.nextInt();
//       int f = getDigitFrequency(n, d);
//       System.out.println(f);
//    }
  
//    public static int getDigitFrequency(int n, int d){
//        int rem=0;
//         int count =0;
//         while(n!=0){
//             rem= n%10;
//             n=n/10;
//             if(rem == d){
//                 count++;
//             }
//         }
//         return count;
      
//    }
//   }
  
  



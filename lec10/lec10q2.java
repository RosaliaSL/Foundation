import java.util.Scanner;

// ceil and floor by binary search
class lec10q2{
    static Scanner scn= new Scanner(System.in);
    
    public static void input(int arr[]){
        for(int i= 0; i<arr.length; i++){
            arr[i]= scn.nextInt();
        }
    }

    public static void ceilFloor(int arr[], int data){
        int left=0;
        int right= arr.length-1;
        int ceil=0;
        int floor=0;
        while(left<=right){
            int mid= (left+right)/2;
            if(arr[mid]==data){
                ceil= data;
                floor= data; 
                System.out.println(ceil);
                System.out.println(floor);
                break;
            }

            else if(arr[mid]<data){
                left=mid+1;
            }
            else{
                right= mid-1;
            }

        }
        if(right==-1){
            ceil=arr[left];
            floor=-1;
            System.out.println(ceil);
            System.out.println(floor);
        }
        else if(left== arr.length){
            ceil=-1;
            floor=arr[right];
            System.out.println(ceil);
            System.out.println(floor);
        }
        else if (left>right){
            ceil= arr[left];
            floor=arr[right];
            System.out.println("the ceil is " +ceil);
            System.out.println(" the floor is" + floor);
        }
    }

    public static void targetSubarray(int[] arr, int target){
        int s=0; int e=0; int csum=0;
        while(e<arr.length){
            csum+= arr[e];

            if(csum==target){
                for(int i=s; i<=e; i++){
                    System.out.print(arr[i]+" ");
                }
                // System.out.println(s+" "+e);
                break;
            }

            if(csum>target){
                csum=0;
                s++;
                e=s-1;
               
            }
            e++;
        }
        // System.out.println(s+" "+e);
    }

    public static void subArrayWithGivenSum(int[] arr, int target){
        int i=0; int j=0;
        int sum=0;
        while(j<arr.length){
            if(sum<target){
                sum+=arr[j];
                j++;
            }
            else if(sum>target){
                sum-=arr[i];
                i++;
            }
            else{
                break;
            }
        }
        if(sum==target){
            System.out.println(i+" "+ (j-1));
        }
    }
    public static void main(String[] args){
        int size= scn.nextInt();
        int[] arr= new int[size];
        input(arr);
        int target =scn.nextInt();
        targetSubarray(arr, target);
        // subArrayWithGivenSum(arr, target);

       
       




    }
}
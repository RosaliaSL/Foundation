import java.lang.reflect.Array;
import java.util.*;
class lec31tree{
    static Scanner scn= new Scanner(System.in);

    //Tree
    
    // Creating a data structure called node
    static class node{
        int data;
        ArrayList<node> child;
        node(int d){
            data = d;
            child = new ArrayList<>();
        }
    }

    //Making a root global variable so that it can be accessed anywhere
    static node root = null;

    // A function to construct a tree from a given array of data
    public static void construct(int[] data){
        ArrayList<node> cpList = new ArrayList<>();
        for(int i = 0; i < data.length ; i++){
            if(data[i] == -1){
                cpList.remove( cpList.size() -1);
            }
            else{
                node nn = new node(data[i]);
                if(root == null){
                    root = nn;
                }
                else{
                    node cp = cpList.get( cpList.size() -1);
                    cp.child.add( nn );
                }
                cpList.add( nn );
            }
        }
    }

    //A function to display the tree
    public static void display(node root){
        System.out.print(root.data + " -> " );
        for( int i = 0; i < root.child.size(); i++){
            System.out.print( root.child.get(i).data + ", ");
        }
        System.out.println();

        for( int i = 0; i < root.child.size(); i++ ){
            display( root.child.get(i));
        }
    }

    public static int sizeOfTree(node root){
        if(root == null){
            return 0;
        }
        int size = 1;
        for( int i = 0; i < root.child.size(); i++ ){
            size += sizeOfTree(root.child.get(i));
        }
        return size;
    }

    public static int maxInTree(node root){
        if(root == null){
            return -1;
        }
        int max = root.data;
        for(int i = 0; i < root.child.size(); i++){
            int childMax = maxInTree(root.child.get(i));
            if(max < childMax){
                max = childMax;
            }
        }
        return max;
    }
    public static int minInTree(node root){
        if(root == null){
            return -1;
        }
        int min = root.data;
        for(int i = 0; i < root.child.size(); i++){
            int childMin = minInTree(root.child.get(i));
            if(min > childMin){
                min = childMin;
            }
        }
        return min;
    }

    public static ArrayList <Integer>nodeToRootPath(node root, int val){
        if(root == null){
            return null;
        }
        if(root.data == val){
            ArrayList<Integer> baseAns = new ArrayList<>();
            baseAns.add(val);
            return baseAns;
        }
        for(int i = 0; i < root.child.size(); i++){
            ArrayList<Integer> recAns = nodeToRootPath(root.child.get(i), val);
            if(recAns != null){
                recAns.add(root.data);
                return recAns;
            }
        }
        return null;
    }

    public static int lowestCommonAncestor(node root, int val1, int val2){
        if(root == null){
            return -1;
        }
        ArrayList <Integer> ans1 = nodeToRootPath(root, val1);
        ArrayList <Integer> ans2 = nodeToRootPath(root, val2);

        int ans = -1;
        int end = Math.min(ans1.size(), ans2.size());
        for(int i = 0; i < end; i++){
            if(ans1.get(ans1.size() - 1 - i) == ans2.get(ans2.size() - 1 - i)){
                ans = ans1.get(ans1.size() - 1 - i);
            }
            else{
                return ans;
            }
        }
        return ans;
    }

    public static int sirLCA(node root, int v1, int v2){
        if(root == null){
            return -1;
        }
        ArrayList<Integer> listForV1 = nodeToRootPath(root, v1);
        ArrayList<Integer> listForV2 = nodeToRootPath(root, v2);
        
        if(listForV1 == null && listForV2 == null){
            return -1;
        }
        else if(listForV1 == null){
            return v2;
        }
        else if(listForV2 == null){
            return v1;
        }
        int i = listForV1.size() - 1, j = listForV2.size() - 1;
        while( i >= 0 && j >= 0){
            if(listForV1.get(i) != listForV2.get(j)){
                break;
            }
            i--; j--;
        }
        return listForV1.get(i + 1);
    }

    public static boolean doesValExist(node root, int val){
        if(root == null){
            return false;
        }
        if(root.data == val){
            return true;
        }
        for(int i = 0; i < root.child.size(); i++){
            boolean recAns = doesValExist(root.child.get(i), val);
            if(recAns == true){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] data = {10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100};
        construct(data);
        // ArrayList <Integer> ans = nodeToRootPath(root, 70);
        // System.out.println(ans);

        // System.out.print(lowestCommonAncestor(root, 10, 120));

        // int lca = sirLCA(root, 10, 80);
        // if(lca != -1){
        //     System.out.println(lca);
        // }
        // else{
        //     System.out.println("lca does not exist");
        // }
        System.out.print(doesValExist(root, 120));

  }
}
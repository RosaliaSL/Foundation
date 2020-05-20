import java.lang.reflect.Array;
import java.util.*;
class lec30tree{
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
        System.out.print( root.data + " -> " );
        for( int i = 0; i < root.child.size(); i++){
            System.out.print( root.child.get(i).data + ", ");
        }
        System.out.println();

        for( int i = 0; i < root.child.size(); i++ ){
            display( root.child.get(i));
        }
    }
    public static void main(String[] args){
        int[] data = {10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100};
        construct(data);
        display(root);


  }
}
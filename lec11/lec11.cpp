#include<iostream>
#include<vector>
using namespace std;

void display(vector<int> &arr){
    for(int i=0; i<arr.size(); i++){
        cout<< arr[i]<<" ";
    }
    cout<< endl;
}

void input(vector<int> &arr){
    for(int i=0; i<arr.size(); i++){
        cin>> arr[i];
    }
}

void increment(vector<int> &arr){
    for(int i=0; i<arr.size(); i++){
        arr[i]= arr[i]+5;
    }
}

void reverse(vector<int> &arr){
    for(int i=0; i<arr.size()/2; i++){
        int temp= arr[i];
        arr[i]=  arr[arr.size()-1-i];
        arr[arr.size()-1-i]=temp;
    }
}

void reverseIndex(vector<int> &arr, int si, int ei){
    while(si<ei){
        int temp = arr[si];
        arr[si]= arr[ei];
        arr[ei]= temp;
        si++; ei--;
    }
}

void rotate(vector<int> &arr, int r){
    reverseIndex(arr, arr.size()-r, arr.size()-1);
    reverseIndex(arr,0,arr.size()-r-1);
    reverseIndex(arr,0, arr.size()-1);

}

void span(vector<int> &arr){
    int max= INT_MIN;
    int min= INT_MAX;
    for(int i=0; i<arr.size(); i++){
        if(arr[i]>max){
            max=arr[i];
        }
        if(arr[i]<min){
            min=arr[i];
        }
    }
    cout<< max-min;
}


void addition(vector <int> &vect1, vector <int> &vect2){
    int size = vect1.size();
    if(size<vect2.size()){
        size= vect2.size();
    }
    size++;
    vector<int>res(size,0);

    int i= vect1.size()-1; int j= vect2.size()-1; int k= res.size()-1;
    int carry=0;
    while(i>=0 && j>=0){
        int sum= vect1[i]+vect2[j]+ carry;
        carry= sum/10;
        sum= sum%10;
        res[k]=sum;
        i--; j-- ; k--;
    }
    while(i>=0){
        int sum= vect1[i]+ carry;
        carry= sum/10;
        sum= sum%10;
        res[k]=sum;
        i--; k--;
    }
    while(j>=0){
        int sum=vect2[j]+ carry;
        carry= sum/10;
        sum= sum%10;
        res[k]=sum;
        j-- ; k--;
    }
    if(carry>0){
        res[k]= carry;
        k--;
    }

    for(int x=0; x<res.size(); x++){
        if( x == 0 && res[x] == 0){
            continue;
        }
        cout<< res[x]<<" ";
    }

}

int main(){
vector <int> arr(4,0);
input(arr);
vector <int> brr(1,0);
input(brr);
addition(arr, brr);



reverse(arr);
display(arr);
rotate(arr,3);
display(arr);
span(arr);

    return 0;
}
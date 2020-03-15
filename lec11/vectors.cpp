#include<iostream>
#include<vector>
using namespace std;

void input(vector <int> &vect){
    for(int i=0; i<vect.size(); i++){
        cin>> vect[i];
    }
}

void display(vector <int> &vect){
    for(int i=0; i<vect.size(); i++){
        cout<< vect[i]<< " ";
    }
}

void increment(vector <int> &vect){
    for(int i=0; i<vect.size(); i++){
        vect[i]= vect[i]+5;
    }
}

void reverse(vector <int> &vect){
    for(int i=0; i<vect.size()/2; i++){
        int temp= vect[i];
        vect[i]= vect[vect.size()-1-i];
        vect[vect.size()-1-i]= temp;
    }
}

void reverseIndex(vector <int> &vect, int si, int ei){
    while(si<ei){
    int temp= vect[si];
    vect[si]= vect[ei];
    vect[ei]= temp;
    si++; ei--;
    }
}

void rotate(vector  <int> &vect, int r){
    reverseIndex(vect, vect.size()-r, vect.size()-1);
    reverseIndex(vect,0,vect.size()-r-1);
    reverseIndex(vect,0, vect.size()-1);

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
    vector <int> vect1(3,0);
    input(vect1);
    vector <int> vect2(1,0);
    input(vect2);
    // reverseIndex(vect1,3,5);
    // rotate(vect1,2);
    addition(vect1, vect2);
   
    

    return 0;
}
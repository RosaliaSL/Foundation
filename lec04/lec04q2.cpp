// Fibonacci pattern, my method

#include<iostream>
using namespace std;
int main(){
    int a=0;
    int b=1;
    int c=a+b;

    int n;
    cin>> n;

          for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
            if(i==1){
                cout<<a<<" ";
            }
            else if(i==2 && j==1){
                cout<<b<<" ";
            }
            else{
                cout<<c<< " ";
                a=b;
                b=c;
                c=a+b;
            }
          
        }
        cout<<endl;

        }
return 0;
}
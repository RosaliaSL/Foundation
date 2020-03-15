//Printing prime numbers 

#include <iostream>
using namespace std;
int main(){

    int n;
    cin>> n;

    for (int cn=2; cn<n; cn++){
        bool isprime=true;
        for(int div=2; div*div<=cn; div++){
            if(cn%div==0){
                isprime= false;
                break;
            }
        }
            
            if(isprime == true){
                cout<< cn<<" ";
            }

        
    }
return 0;
}
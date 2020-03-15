// Rotation of a number by r 

#include <iostream>
using namespace std;
int main(){

    int n;
    cin>> n;
    int dn =n;
    int r;
    cin>> r;
    int dr= r;

    int length=0;
    while(dn!=0){
        length++;
        dn=dn/10;
    }

    r=r%length;

    if(r<0){
        r= length+r;
    }
    int digits=length-r;
    
    int rem=0;
    int ans=0;
    int pow=1;

    while(r>0){
        int rem= n%10;
        n=n/10;
        ans= ans + pow*rem;
        pow=pow*10;
        r--;
    }

    
    while(digits>0){
        ans = ans*10;
        digits--;
    }

    ans=ans +n;
    cout << ans;




    return 0;
}
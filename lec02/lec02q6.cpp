#include <iostream>
#include <cmath>
using namespace std;
int main(){
    int n;
    cin >> n;
    int rem;

    int ans=0;

    while (n>0){
        rem= n%10;
        n=n/10;
        int count;
        ans= ans + count* pow(10, rem);
        count++;
    }
    cout << ans;
}
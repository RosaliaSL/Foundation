//Simple addition, multiplication, division

#include <iostream>
using namespace std;
int main (){
    // cout << "hello world"<< endl;


    // int a=20;
    // int b=30;
    // cout << a+b;

    // int a=60;
    // int b=20;
    // cout << a-b;

    // int a=60;
    // int b=20;
    // cout << a*b;

    // int a=60;
    // int b=20;
    // cout << a/b;

    // int amount =2000;
    // int rate =3;
    // int time =2;
    // int SI=(amount*rate*time)/100;
    // cout << SI;

    cout<< "Enter the amount"<<endl;
    int amount;
    cin>> amount;
    
    cout<< "enter the rate"<<endl;
    int rate;
    cin>> rate;

    cout<< "enter the time"<<endl;
    int time;
    cin >> time;

    int si= (amount*time*rate)/100;

    cout << si;




    return 0;
}
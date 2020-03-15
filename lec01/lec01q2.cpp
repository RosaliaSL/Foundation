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
    int amount=0;
    cin>> amount;
    
    cout<< "enter the rate"<<endl;
    int rate=0;
    cin>> rate;

    cout<< "enter the time"<<endl;
    int time=0;
    cin >> time;

    int si= (amount*time*rate)/100;

    cout << "The simple interst is:"<< si<< endl;




    return 0;
}
